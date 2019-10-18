package baicheng.bcxiangmuguanli.dao;

import baicheng.bcxiangmuguanli.model.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductDao {
    //查询全部项目组
    public List<Product> queryall();

    //项目组增加成员
    public int adduser(@Param("user_id")String user_id,@Param("product_id")String product_id,@Param("start_time")String start_time,@Param("end_time")String end_time);

    //项目组减少成员
    public int deluser(@Param("user_id")String user_id,@Param("product_id")String product_id);

}
