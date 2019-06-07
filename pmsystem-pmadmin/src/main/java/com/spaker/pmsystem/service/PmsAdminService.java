package com.spaker.pmsystem.service;

import com.spaker.pmsystem.dto.PmsAdminParam;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by sunshine on 2019/3/24.
 */
public interface PmsAdminService {
    /**
     * 根据用户名获取后台管理员
     * @param username
     *
     */
    PmsAdmin getAdminByUsername(String username);

    /**
     * 注册
     * @param pmsAdminParam
     *
     */
    PmsAdmin register(PmsAdminParam pmsAdminParam);

    /**
     * 登录功能
     * @return 生成的jwt token
     */
    String login(String username,String password);

    /**
     * 刷新token功能
     * @param oldToken
     *
     */
    String refreshToken(String oldToken);

    /**
     * 根据用户id获取用户
     * @param id
     *
     */
    PmsAdmin getItem(int id);

    /**
     * 根据用户名称分页查询用户
     */
    List<PmsAdmin>list(String name,Integer pageSize,Integer pageNum);

    /**
     * 修改指定用户信息
     */
    int update(int id,PmsAdmin admin);

    /**
     * 删除指定用户
     */
    int delete(int id);

    /**
     * 修改用户角色关系
     */
    @Transactional
    int updateRole(int adminId, List<Integer> roleIds);

    /**
     * 获取用户对应角色
     */
    List<PmsRole> getRoleList(int adminId);

    /**
     * 修改用户的+-权限
     */
    @Transactional
    int updatePermission(int adminId, List<Integer> permissionIds);

    
    /**
     * 获取用户权限(包括角色权限与+-权限)
     */
    List<PmsPermission>getPermissionList(int adminId);

}
