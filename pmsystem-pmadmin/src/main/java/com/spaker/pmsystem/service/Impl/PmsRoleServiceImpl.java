package com.spaker.pmsystem.service.Impl;

import com.spaker.pmsystem.dao.PmsRolePermissionRelationDao;
import com.spaker.pmsystem.mapper.PmsRoleMapper;
import com.spaker.pmsystem.mapper.PmsRolePermissionRelationMapper;
import com.spaker.pmsystem.model.*;
import com.spaker.pmsystem.service.PmsRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 后台角色管理service实现类
 * Created by sunshine on 2019/3/29.
 */
@Service
public class PmsRoleServiceImpl implements PmsRoleService {
    @Autowired
    private PmsRoleMapper pmsRoleMapper;

    @Autowired
    private PmsRolePermissionRelationMapper pmsRolePermissionRelationMapper;


    @Autowired
    private PmsRolePermissionRelationDao pmsRolePermissionRelationDao;

    
    @Override
    public int create(PmsRole role) {
        role.setCreateTime(new Date());
        role.setAdminCount(0);
        role.setSort(0);
        return pmsRoleMapper.insert(role);
    }


    @Override
    public int update(int id, PmsRole role) {
        role.setId(id);
    return pmsRoleMapper.updateByPrimaryKey(role);
    }

    @Override
    public int delete(List<Integer> ids) {
        PmsRoleExample pmsRoleExample=new PmsRoleExample();
        pmsRoleExample.createCriteria().andIdIn(ids);
        return pmsRoleMapper.deleteByExample(pmsRoleExample);
    }

    @Override
    public List<PmsPermission> getPermissionList(int roleId) {
        return pmsRolePermissionRelationDao.getPermissionList(roleId);
    }

    @Override
    public int updatePermission(int roleId, List<Integer> permissionIds) {
        //先删除原有关系
        PmsRolePermissionRelationExample example=new PmsRolePermissionRelationExample();
        example.createCriteria().andRoleIdEqualTo(roleId);
        pmsRolePermissionRelationMapper.deleteByExample(example);
        //批量插入新关系
        List<PmsRolePermissionRelation>relationList=new ArrayList<>();
        for (Integer permissionId:permissionIds){
            PmsRolePermissionRelation relation=new PmsRolePermissionRelation();
            relation.setRoleId(roleId);
            relation.setPermissionId(permissionId);
            relationList.add(relation);
        }
        return pmsRolePermissionRelationDao.insertList(relationList);
    }

    @Override
    public List<PmsRole> list() {
        return pmsRoleMapper.selectByExample(new PmsRoleExample());
    }
}
