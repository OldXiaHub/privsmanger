package org.taru.api.service;

import org.taru.api.dao.PermissionDao;
import org.taru.api.entity.Permission;

import java.util.List;

/**
 * 菜单
 */
public class PermissionService {
    /**
     * 查询父菜单
     * @return
     */
    public List<Permission> queryBossMenu(){
        PermissionDao permissiondao=new PermissionDao();
        List<Permission> list=permissiondao.queryBossMenu();
        return list;
    }

}
