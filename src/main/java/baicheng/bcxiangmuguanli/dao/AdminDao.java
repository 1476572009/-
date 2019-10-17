package baicheng.bcxiangmuguanli.dao;


import baicheng.bcxiangmuguanli.model.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminDao {

    //登录
    public List<Admin> login(Admin admin);

}
