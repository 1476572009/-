package baicheng.bcxiangmuguanli.api;

import baicheng.bcxiangmuguanli.service.ProductService;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/product")
public class ProductApi {
    @Autowired
    ProductService ps;
    JsonResult result=null;

    //查询全部项目组
    @RequestMapping("/queryall")
    public JsonResult queruall(){
        try {
            List list=ps.queryall();
            result=new JsonResult("200","查询成功",list);
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

    //同意
    @RequestMapping("/tongyi")
    public JsonResult tongyi(String user_id,String product_id,String start_time,String end_time,String alive_now,String now_product_id,String id,String is_agree){
        try {
            int i=ps.tongyi(user_id,product_id,start_time,end_time,alive_now,now_product_id,id,is_agree);
            result=new JsonResult("200","成功",i);
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }











    //项目组增加成员
    @RequestMapping("/adduser")
    public JsonResult adduser(String user_id,String product_id,String start_time,String end_time){
        try {
            int i=ps.adduser(user_id,product_id,start_time,end_time);
            if(i>0){
                result=new JsonResult("200","增加成功",i);
            }
            else{
                result=new JsonResult("500","增加失败",i);
            }

        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

    //项目组减少成员
    @RequestMapping("/deluser")
    public JsonResult deluser(String user_id,String product_id){
        try {
            int i=ps.deluser(user_id,product_id);
            if(i>0){
                result=new JsonResult("200","删除成功",i);
            }
            else{
                result=new JsonResult("500","删除失败",i);
            }

        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

}
