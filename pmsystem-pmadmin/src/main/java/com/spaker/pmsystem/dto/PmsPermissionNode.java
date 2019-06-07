package com.spaker.pmsystem.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 权限节点
 * Created by sunshine on 2019/3/29.
 */
public class PmsPermissionNode extends PmsPermission {
    @Getter
    @Setter
    private List<PmsPermissionNode>children;
}
