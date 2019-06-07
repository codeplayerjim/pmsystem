package com.spaker.pmsystem.service.Impl;

import com.github.pagehelper.PageHelper;
import com.spaker.pmsystem.dao.PmsAdminPermissionRelationDao;
import com.spaker.pmsystem.dao.PmsAdminRoleRelationDao;
import com.spaker.pmsystem.dto.PmsAdminParam;
import com.spaker.pmsystem.service.PmsAdminService;
import com.spaker.pmsystem.util.JwtTokenUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台管理员
 * Created by sunshine on 2019/3/24.
 */
@Service
public class PmsAdminServiceImpl implements PmsAdminService {

    private static final Logger LOGGER= LoggerFactory.getLogger(PmsEmployeeServiceImpl.class);
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private UserDetailsService userDetailsService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private PmsAdminRoleRelationDao adminRoleRelationDao;

    @Autowired
    private PmsAdminRoleRelationMapper pmsAdminRoleRelationMapper;

    @Autowired
    private PmsAdminPermissionRelationMapper pmsAdminPermissionRelationMapper;

    @Autowired
    private PmsAdminPermissionRelationDao pmsAdminPermissionRelationDao;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    PmsAdminMapper pmsAdminMapper;


    @Override
    public PmsAdmin getAdminByUsername(String username) {
        PmsAdminExample example=new PmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        List<PmsAdmin>adminList=pmsAdminMapper.selectByExample(example);
        if(adminList!=null&&adminList.size()>0){
            return adminList.get(0);
        }
        return null;
    }

    /**
     * 注册
     * @param pmsAdminParam
     *
     */

    @Override
    public PmsAdmin register(PmsAdminParam pmsAdminParam) {
        PmsAdmin pmsAdmin=new PmsAdmin();
        BeanUtils.copyProperties(pmsAdminParam,pmsAdmin);
        pmsAdmin.setCreateTime(new Date());
        pmsAdmin.setStatus(1);
        //查看是否有相同用户名的用户
        PmsAdminExample example=new PmsAdminExample();
        example.createCriteria().andUsernameEqualTo(pmsAdmin.getUsername());
        List<PmsAdmin>pmsAdminList=pmsAdminMapper.selectByExample(example);
        if (pmsAdminList.size()>0){
            return null;
        }
        //将密码进行加密操作
        String md5Password=passwordEncoder.encode(pmsAdmin.getPassword());
        pmsAdmin.setPassword(md5Password);
        pmsAdminMapper.insert(pmsAdmin);
        return pmsAdmin;
    }

    @Override
    public String login(String username, String password) {
        String token=null;
        //密码需要客户端加密后传递
        try {
            UserDetails userDetails=userDetailsService.loadUserByUsername(username);
            if(!passwordEncoder.matches(password,userDetails.getPassword())){
                throw new BadCredentialsException("密码不正确");
            }
            UsernamePasswordAuthenticationToken authenticationToken=new UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
            SecurityContextHolder.getContext().setAuthentication(authenticationToken);
            token=jwtTokenUtil.generateToken(userDetails);
            updateLoginTimeByUser(username);
        } catch (AuthenticationException e) {
           LOGGER.info("登录异常：{}",e.getMessage());
        }
    return token;

    }

    /**
     * 根据用户名修改登录时间
     * @param username
     */
    private void updateLoginTimeByUser(String username){
        PmsAdmin record=new PmsAdmin();
        record.setLoginTime(new Date());
        PmsAdminExample example=new PmsAdminExample();
        example.createCriteria().andUsernameEqualTo(username);
        pmsAdminMapper.updateByExampleSelective(record,example);

    }

//    /**
//     * 添加登录记录
//     * @param username 用户名
//     */
//    private void insertLoginLog(String username){
//        PmsAdmin admin=getAdminByUsername(username);
//
//    }

    @Override
    public String refreshToken(String oldToken) {
        String token=oldToken.substring(tokenHead.length());
        if(jwtTokenUtil.canRefresh(token)){
            return jwtTokenUtil.refreshToken(token);
        }
        return null;
    }

    @Override
    public PmsAdmin getItem(int id) {
        return pmsAdminMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsAdmin> list(String name, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum,pageSize);
        PmsAdminExample example=new PmsAdminExample();
        PmsAdminExample.Criteria criteria=example.createCriteria();
        if(!StringUtils.isEmpty(name)){
            criteria.andUsernameLike("%"+name+"%");
            example.or(example.createCriteria().andNickNameLike("%"+name+"%"));
        }
        return pmsAdminMapper.selectByExample(example);
    }

    @Override
    public int update(int id, PmsAdmin admin) {
        admin.setId(id);
        return pmsAdminMapper.updateByPrimaryKey(admin);
    }

    @Override
    public int delete(int id) {
        return pmsAdminMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateRole(int adminId, List<Integer> roleIds) {
        int count=roleIds==null?0:roleIds.size();
        //删除原来关系
        PmsAdminRoleRelationExample adminRoleRelationExample=new PmsAdminRoleRelationExample();
        adminRoleRelationExample.createCriteria().andAdminIdEqualTo(adminId);
        pmsAdminRoleRelationMapper.deleteByExample(adminRoleRelationExample);
        //建立新关系
        if(!CollectionUtils.isEmpty(roleIds)){
            List<PmsAdminRoleRelation>list=new ArrayList<>();
            for(int roleId:roleIds){
                PmsAdminRoleRelation roleRelation=new PmsAdminRoleRelation();
                roleRelation.setAdminId(adminId);
                roleRelation.setRoleId(roleId);
                list.add(roleRelation);
            }
            adminRoleRelationDao.insertList(list);
        }
        return count;
    }

    @Override
    public List<PmsRole> getRoleList(int adminId) {
        return adminRoleRelationDao.getRoleList(adminId);
    }

    @Override
    public int updatePermission(int adminId, List<Integer> permissionIds) {
        //删除原所有权限关系
        PmsAdminPermissionRelationExample relationExample=new PmsAdminPermissionRelationExample();
        relationExample.createCriteria().andAdminIdEqualTo(adminId);
        pmsAdminPermissionRelationMapper.deleteByExample(relationExample);
        //获取用户所有角色权限
        List<PmsPermission>permissionList=adminRoleRelationDao.getRolePermissionList(adminId);
        //java8
        List<Integer>rolePermissionList=permissionList.stream().map(PmsPermission::getId).collect(Collectors.toList());
        if(!CollectionUtils.isEmpty(permissionIds)){
            List<PmsAdminPermissionRelation>relationList=new ArrayList<>();
            //筛选出+权限
            List<Integer>addPermissionIdList=permissionIds.stream().filter(permissionId->!rolePermissionList.contains(permissionId)).collect(Collectors.toList());
            //筛选出-权限
            List<Integer>subPermissionIdList=rolePermissionList.stream().filter(permissionId->!permissionIds.contains(permissionId)).collect(Collectors.toList());
            //插入+-权限关系
            relationList.addAll(convert(adminId,1,addPermissionIdList));
            relationList.addAll(convert(adminId,-1,addPermissionIdList));
            return pmsAdminPermissionRelationDao.insertList(relationList);
        }
        return 0;
    }

    /**
     *
     * 将+-权限关系转化为对象
     *
     */
    private List<PmsAdminPermissionRelation>convert(Integer adminId,Integer type,List<Integer>permissionIdList){
        List<PmsAdminPermissionRelation>relationList=permissionIdList.stream().map(permissionId->{
            PmsAdminPermissionRelation relation=new PmsAdminPermissionRelation();
            relation.setAdminId(adminId);
            relation.setType(type);
            relation.setPermissionId(permissionId);
            return relation;
        }).collect(Collectors.toList());
        return relationList;
    }

    @Override
    public List<PmsPermission> getPermissionList(int adminId) {
        return adminRoleRelationDao.getPermissionList(adminId) ;
    }
}
