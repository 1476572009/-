package baicheng.bcxiangmuguanli.dao;

import baicheng.bcxiangmuguanli.vo.User_Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserDao {
    //查询全部员工
    public List<User_Product> selectall(@Param("user_name") String user_name,@Param("product_name") String product_name,@Param("date") String date);
}
