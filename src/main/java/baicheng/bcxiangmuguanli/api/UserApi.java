package baicheng.bcxiangmuguanli.api;


import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.service.AdminService;
import baicheng.bcxiangmuguanli.service.UserService;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/user")
public class UserApi {
    @Autowired
    UserService us;
    JsonResult result=null;


    //查询全部用户
    @RequestMapping("/selectall")
    public JsonResult select(String user_name,String product_name,String date){
        String uname=null;
        String pname=null;

        System.out.println(user_name);
        System.out.println(product_name);
        if(user_name!=null&&user_name!=""){
            uname="%"+user_name+"%";
        }
        if(product_name!=null&&product_name!=""){
            pname="%"+product_name+"%";
        }
        System.out.println(uname);
        System.out.println(pname);
        try {
            List list=us.selectall(uname,pname,date);
            result=new JsonResult("200","查询成功",list);
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

}
