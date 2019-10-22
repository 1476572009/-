package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.AdminDao;
import baicheng.bcxiangmuguanli.dao.UserDao;
import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.service.AdminService;
import baicheng.bcxiangmuguanli.service.UserService;
import baicheng.bcxiangmuguanli.vo.TimeList;
import baicheng.bcxiangmuguanli.vo.User_Product;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao ud;

    @Override
    public List<User_Product> selectall(String user_name,String product_name,String start_time,String end_time){
        return ud.selectall(user_name,product_name,start_time,end_time);
    }

    @Override
    public int addusertime(String user_id) {
        List list = TimeList.getList("2019-05-01","2020-05-01");
        return ud.addusertime(user_id,list);
    }


    @Override
    public List<User_Product> queryuser(String start_time, String end_time) {
        return ud.queryuser(start_time,end_time);
    }


}
