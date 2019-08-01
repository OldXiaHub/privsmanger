package org.taru.api.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.taru.api.vo.JsonResult;

import java.io.File;

@RestController
public class UserApi {
    @Value("${upload.absolutePath}") //大括号里的都是key值   $表示调用配置文件     #表示调用xml配置文件
    private String absolutePath;//动态路径


    @RequestMapping("/api/user/upload")
    public JsonResult upload(@RequestParam("image-header") MultipartFile multipartFile){
        JsonResult result=null;
        if(!multipartFile.isEmpty()){
            try {
                multipartFile.transferTo(new File(absolutePath+"\\"+multipartFile.getOriginalFilename()));
                result=new JsonResult("200","上传头像成功","");
            }catch (Exception e){
                e.printStackTrace();
                result=new JsonResult("500","上传头像失败","");
            }
        }else {
            result=new JsonResult("404","没有数据","");
        }
        return  result;

    }
}
