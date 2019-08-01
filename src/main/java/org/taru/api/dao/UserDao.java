package org.taru.api.dao;

import org.taru.api.entity.User;
import org.taru.api.util.Dbutil;
import org.taru.api.util.StringUtil;


import java.util.List;
import java.util.Map;

public class UserDao {
    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */

    /**
     * 删除用户
     * @param
     */
    public void deleteUser(String userid){
        String sql="update user set user_status=0 where USER_ID=?";
        Dbutil.update(sql, userid);
    }
}
