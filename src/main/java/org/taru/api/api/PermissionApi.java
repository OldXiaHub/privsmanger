package org.taru.api.api;

import org.taru.api.entity.Permission;
import org.taru.api.service.PermissionService;
import org.taru.api.util.Dbutil;
import org.taru.api.util.StringUtil;
import org.taru.api.vo.JsonResult;

import java.util.List;
import java.util.Map;

/**
 * 权限菜单api
 */
public class PermissionApi {

    /**
     * 查询父菜单
     *
     * @return
     */
    public JsonResult queryBossMenu() {
        PermissionService permissionservice = new PermissionService();
        JsonResult jsonResult = null;
        try {
            List<Permission> list = permissionservice.queryBossMenu();
            if (list != null) {
                jsonResult = new JsonResult("200", "查询成功", list);
            } else {
                jsonResult = new JsonResult("404", "查询失败", "");
            }

        } catch (Exception e) {
            e.printStackTrace();
            jsonResult = new JsonResult("500", e.getMessage(), "");
        }

        return jsonResult;
    }

}
