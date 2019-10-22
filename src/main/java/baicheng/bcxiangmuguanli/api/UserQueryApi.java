package baicheng.bcxiangmuguanli.api;



import baicheng.bcxiangmuguanli.model.UserLi;
import baicheng.bcxiangmuguanli.service.UserQueryService;
import baicheng.bcxiangmuguanli.vo.JsonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin(allowCredentials = "true")
public class UserQueryApi {
    @Autowired
    UserQueryService s;
    @RequestMapping(value = "/a/userQuerys",method = RequestMethod.POST)
    @ResponseBody
    public JsonResult userQuery(@Param("id")String id){
        List<UserLi> list= s.userQuery(id);
        JsonResult json=null;
        try{
            if(list.size()>0){
                json=new JsonResult("200","查询成功",list);
            }else {
                json=new JsonResult("404","查询失败",null);
            }
        }catch (Exception e){
            e.printStackTrace();
            json=new JsonResult("500","查询异常",null);
        }
        return json;
    };
}
