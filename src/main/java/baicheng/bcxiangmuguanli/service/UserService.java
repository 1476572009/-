package baicheng.bcxiangmuguanli.service;

import baicheng.bcxiangmuguanli.vo.User_Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {

    //查询全部员工
    public List<User_Product> selectall(String user_name,String product_name,String start_time,String end_time);

    //新增用户时间表
    public int addusertime(String user_id);



    //查询全部员工
    public List<User_Product> queryuser(@Param("start_time") String start_time, @Param("end_time") String end_time);
}
