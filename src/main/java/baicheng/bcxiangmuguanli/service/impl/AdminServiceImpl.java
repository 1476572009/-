package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.AdminDao;
import baicheng.bcxiangmuguanli.model.Admin;
import baicheng.bcxiangmuguanli.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminDao ad;

    //登录
    @Override
    public List<Admin> login(Admin admin) {
        return ad.login(admin);
    }



}
