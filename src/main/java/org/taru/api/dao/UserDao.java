package org.taru.api.dao;

import org.taru.api.entity.User;
import org.taru.api.util.Dbutil;
import org.taru.api.util.StringUtil;


import java.util.List;
import java.util.Map;

public class UserDao {
    public User login(String username,String password){
        String sql="select *from user where user_id=?";
        List<Map<String,Object>> list= Dbutil.query(sql,username,password);
        User user=null;
        if(list.size()>0) {
            user=new User();
            user.setUserName(StringUtil.valueOf(list.get(0).get("USER_NAME")));
            user.setUserPassword(StringUtil.valueOf(list.get(0).get("USER_PASSWORD")));

        }
        return user;
    }

    /**
     * 删除用户
     * @param
     */
    public void deleteUser(String userid){
        String sql="update user set user_status=0 where USER_ID=?";
        Dbutil.update(sql, userid);
    }
}
