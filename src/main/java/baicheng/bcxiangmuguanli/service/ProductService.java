package baicheng.bcxiangmuguanli.service;

import baicheng.bcxiangmuguanli.model.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductService {
    //查询全部项目组
    public List<Product> queryall();

    //项目组增加成员
    public int adduser(String user_id,String product_id,String start_time,String end_time);

    //项目组减少成员
    public int deluser(String user_id,String product_id);
    //同意
    public int tongyi(String user_id,String user_name,String product_id,String product_name,String start_time,String end_time,String alive_now,String now_product_id,String id,String is_agree);


}
