package baicheng.bcxiangmuguanli.service;

import baicheng.bcxiangmuguanli.vo.User_Product;

import java.util.List;

public interface UserService {

    //查询全部员工
    public List<User_Product> selectall(String user_name,String product_name,String date);
}
