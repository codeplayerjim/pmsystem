package com.spaker.pmsystem.service.Impl;

import com.spaker.pmsystem.dto.PmsPermissionNode;
import com.spaker.pmsystem.mapper.PmsPermissionMapper;
import com.spaker.pmsystem.model.PmsPermission;
import com.spaker.pmsystem.model.PmsPermissionExample;
import com.spaker.pmsystem.service.PmsPermissionService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 后台权限管理service实现类
 * Created by sunshine on 2019/3/29.
 */
public class PmsPermissionServiceImpl implements PmsPermissionService {
    @Autowired
    PmsPermissionMapper pmsPermissionMapper;


    @Override
    public int create(PmsPermission permission) {
        permission.setStatus(1);
        permission.setCreateTime(new Date());
        permission.setSort(0);
        return pmsPermissionMapper.insert(permission);
    }

    @Override
    public int update(int id, PmsPermission permission) {
        permission.setId(id);
        return pmsPermissionMapper.updateByPrimaryKey(permission);
    }

    @Override
    public int delete(List<Integer> ids) {
        PmsPermissionExample example=new PmsPermissionExample();
        example.createCriteria().andIdIn(ids);
        return pmsPermissionMapper.deleteByExample(example);
    }

    @Override
    public List<PmsPermissionNode> treeList() {
        List<PmsPermission>pmsPermissionList=pmsPermissionMapper.selectByExample(new PmsPermissionExample());
        //java8
        List<PmsPermissionNode>result=pmsPermissionList.stream()
                .filter(pmsPermission -> pmsPermission.getPid().equals(0))
                .map(pmsPermission ->covert(pmsPermission,pmsPermissionList)).collect(Collectors.toList());

        return result;
    }

    /**
     * 将权限转换为带有子级的权限对象
     * 当找不到子级权限的时候Map操作不会再递归调用covert
     *
     */
    private PmsPermissionNode covert(PmsPermission pmsPermission,List<PmsPermission>pmsPermissionList){
        PmsPermissionNode node=new PmsPermissionNode();
        BeanUtils.copyProperties(pmsPermission,node);
        //寻找子级权限
        List<PmsPermissionNode>children=pmsPermissionList.stream()
                .filter(subPermission->subPermission.getPid().equals(pmsPermission.getId()))
                .map(subPermission->covert(subPermission,pmsPermissionList)).collect(Collectors.toList());
        node.setChildren(children);
        return node;
    }

    @Override
    public List<PmsPermission> list() {
        return pmsPermissionMapper.selectByExample(new PmsPermissionExample());
    }
}
