package org.taru.api.dao;

import org.taru.api.entity.Permission;
import org.taru.api.util.Dbutil;
import org.taru.api.util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PermissionDao {
    /**
     * 查询父菜单
     * @return
     */
    public List<Permission> queryBossMenu(){
        String sql="select * from Permission where parent_id=0";
        List<Map<String,Object>> list= Dbutil.query(sql);
        List<Permission> list1=new ArrayList<>();
        Permission permission=new Permission();
        if (list.size()>0){
            permission.setId((int)(list.get(0).get("s")));
            permission.setPermissionName(StringUtil.valueOf(list.get(0).get("perssion_name")));
            list1.add(permission);
        }
        return list1;
    }

    /**
     * 查询菜单
     */
    public List<Permission> queryAllMenu(){
        String sql="select * from user a left join user_role b on a.user_id=b.user_id left join role c b.role_id=c.role_id left join role_menu d on c.role_id=d.role_id left join permission e on d.menu_id=e.id";
        return null;

    }
}
