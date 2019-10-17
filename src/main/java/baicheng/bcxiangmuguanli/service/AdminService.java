package baicheng.bcxiangmuguanli.service;

import baicheng.bcxiangmuguanli.model.Admin;

import java.util.List;


public interface AdminService {
    //登录
    public List<Admin> login(Admin admin);
}
