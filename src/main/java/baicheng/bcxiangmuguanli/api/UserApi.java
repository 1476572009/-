package baicheng.bcxiangmuguanli.api;


import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.service.AdminService;
import baicheng.bcxiangmuguanli.service.UserService;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public JsonResult select(String user_name,String product_name,String start_time,String end_time,int pageNum,int pageSize){
        String uname=null;
        String pname=null;
        if(user_name!=null&&user_name!=""){
            uname="%"+user_name+"%";
        }
        if(product_name!=null&&product_name!=""){
            pname="%"+product_name+"%";
        }
        try {
            PageHelper.startPage(pageNum, pageSize);
            List list=us.selectall(uname,pname,start_time,end_time);
            PageInfo page = new PageInfo(list);
            result=new JsonResult("200","查询成功",page);
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }
    //添加用户时间表
    @RequestMapping("/addusertime")
    public JsonResult add(String user_id){
        try {
            int i =us.addusertime(user_id);
            if (i>0){
                result=new JsonResult("200","添加成功",i);
            }
            else {
                result=new JsonResult("500","添加失败",i);
            }
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }


    //查询空闲用户
    @RequestMapping("/queryuser")
    public JsonResult queryuser(String start_time,String end_time){
        try {
            List list=us.queryuser(start_time,end_time);
            result=new JsonResult("200","查询成功",list);

        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }
}
