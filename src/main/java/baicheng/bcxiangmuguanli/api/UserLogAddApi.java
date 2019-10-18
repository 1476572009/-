package baicheng.bcxiangmuguanli.api;


import baicheng.bcxiangmuguanli.model.Userjron;
import baicheng.bcxiangmuguanli.service.UserLogInterface;
import baicheng.bcxiangmuguanli.vo.Auth;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin(allowCredentials = "true")
public class UserLogAddApi {
    @Autowired
    UserLogInterface l;

    @RequestMapping(value = "/a/logadd",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult userLogadd(Userjron userjron){
          int x=  l.LogAdd(userjron);
        JsonResult jsonResult = null;
        try{

            if(x != 0){
                jsonResult = new JsonResult("200","提交订单成功",null);
            }else {
                jsonResult = new JsonResult("400","提交订单失败",null);
            }
        }catch (Exception e){
            jsonResult = new JsonResult("500","服务器异常", e.getMessage());
        }
        return jsonResult;

    }
}
