package service;

import dao.UserDaoImpl;

public class RoleService {
    //角色删除
    public int delete(String roleId){
        UserDaoImpl daoImpl=new UserDaoImpl();
        return daoImpl.delete(roleId);
    }
}
