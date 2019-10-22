package baicheng.bcxiangmuguanli.dao;

import baicheng.bcxiangmuguanli.vo.User_Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    //查询全部员工
    public List<User_Product> selectall(@Param("user_name") String user_name,@Param("product_name") String product_name,@Param("start_time") String start_time,@Param("end_time") String end_time);

    //新增用户时间表
    public int addusertime(String user_id,List list);

    //修改用户时间表
    public int updateusertime(String user_id,String product_id,List list,String status);

    //查询全部员工
    public List<User_Product> queryuser(@Param("start_time") String start_time,@Param("end_time") String end_time);
}
