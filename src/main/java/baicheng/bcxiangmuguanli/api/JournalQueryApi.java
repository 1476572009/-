package baicheng.bcxiangmuguanli.api;


import baicheng.bcxiangmuguanli.model.Userjron;
import baicheng.bcxiangmuguanli.service.JournalQueryInterface;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;

@Controller
@CrossOrigin(allowCredentials = "true")
public class JournalQueryApi {
    @Autowired
    JournalQueryInterface j;

    @RequestMapping(value = "/api/logquery",method = RequestMethod.GET)
    @ResponseBody
    public JsonResult journal(@Param("id")String id,@Param("name")String name,@Param("project")String project){
        HashMap hashMap=new HashMap();
        hashMap.put("id",id);
        hashMap.put("name",name);
        hashMap.put("project",project);
        List<Userjron> list=j.journalQuery(hashMap);
        JsonResult jsonResult = null;
        try{

            if(list.size()>0){
                jsonResult = new JsonResult("200","提交订单成功",list);
            }else {
                jsonResult = new JsonResult("400","提交订单失败",null);
            }
        }catch (Exception e){
            jsonResult = new JsonResult("500","服务器异常", e.getMessage());
        }
        return jsonResult;


    };
}
