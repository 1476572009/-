package baicheng.bcxiangmuguanli.api;


import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.model.Transfer;
import baicheng.bcxiangmuguanli.service.AdminService;
import baicheng.bcxiangmuguanli.service.TransferService;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/transfer")
public class TransferApi {
    @Autowired
    TransferService ts;
    JsonResult result=null;


    //查询
    @RequestMapping("/query")
    public JsonResult query(String boss){
        try {
            List list=ts.query(boss);
            result=new JsonResult("200","查询成功",list);
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

    //提交申请
    @RequestMapping("/add")
    public JsonResult add(Transfer transfer){
        try {
            int i =ts.add(transfer);
            if (i>0){
                result=new JsonResult("200","申请提交成功",i);
            }
           else {
                result=new JsonResult("500","申请提交失败",i);
            }
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }

    //审核申请
    @RequestMapping("/update")
    public JsonResult update(String id,String is_agree){
        try {
            int i =ts.update(id,is_agree);
            if (i>0){
                result=new JsonResult("200","审核提交成功",i);
            }
            else {
                result=new JsonResult("500","审核提交失败",i);
            }
        }catch (Exception e){
            e.printStackTrace();
            result=new JsonResult("400","异常",null);
        }
        return result;
    }
}
