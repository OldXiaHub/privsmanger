package org.taru.api.api;

import org.springframework.web.bind.annotation.*;
import org.taru.api.entity.User;
import org.taru.api.service.ApiService;
import org.taru.api.vo.JsonResult;

import javax.servlet.http.HttpSession;

@CrossOrigin(origins = "http://localhost:8081/api/login",maxAge = 3600)
@RestController
public class LoginApi {
    /**
     * Ajax登录
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value="/api/login",method = RequestMethod.POST)
    @ResponseBody   //Ajax
    public JsonResult login(String username, String password, HttpSession session){
        ApiService as=new ApiService();
        JsonResult result=null;
        try{
            User user=as.login(username,password);
            if(user==null){
                result=new JsonResult("404","用户名或密码错误","");
            }else{
                result=new JsonResult("200","登陆成功","");
                session.setAttribute("loginUserKey",user);
            }
        }
        catch(Exception e){
            e.printStackTrace();
            result=new JsonResult("500",e.getMessage(),"");
        }
        return result;
    }
}
