package baicheng.bcxiangmuguanli.api;


import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.service.AdminService;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/admin")
public class AdminApi {
    @Autowired
    AdminService as;
    JsonResult result=null;


    //登录
    @RequestMapping("/login")
    public JsonResult login(Admin admin){
        try {
            List list=as.login(admin);
            if (list.size()==1){
                result=new JsonResult("200","登录成功",list.get(0));
            }
            else {
                result=new JsonResult("500","登录失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

}
