package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.TransferDao;
import baicheng.bcxiangmuguanli.dao.UserDao;
import baicheng.bcxiangmuguanli.model.Transfer;
import baicheng.bcxiangmuguanli.service.TransferService;
import baicheng.bcxiangmuguanli.service.UserService;
import baicheng.bcxiangmuguanli.vo.User_Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    TransferDao td;


    @Override
    public List<Transfer> query(String boss) {
        return td.query(boss);
    }

    @Override
    public int add(Transfer transfer) {
        return td.add(transfer);
    }

    @Override
    public int update(String id, String is_agree) {
        return td.update(id,is_agree);
    }

}
