package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.AdminDao;
import baicheng.bcxiangmuguanli.dao.UserDao;
import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.service.AdminService;
import baicheng.bcxiangmuguanli.service.UserService;
import baicheng.bcxiangmuguanli.vo.User_Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao ud;

    @Override
    public List<User_Product> selectall(String user_name,String product_name,String date){
        return ud.selectall(user_name,product_name,date);
    }
}
