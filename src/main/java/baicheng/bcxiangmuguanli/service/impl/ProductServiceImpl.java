package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.ProductDao;
import baicheng.bcxiangmuguanli.dao.TransferDao;
import baicheng.bcxiangmuguanli.model.Product;
import baicheng.bcxiangmuguanli.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductDao pd;
    @Autowired
    TransferDao td;

    @Override
    public List<Product> queryall() {
        return pd.queryall();
    }

    @Override
    public int adduser(String user_id,String product_id,String start_time,String end_time) {
        return pd.adduser(user_id,product_id,start_time,end_time);
    }

    @Override
    public int deluser(String user_id,String product_id) {
        return pd.deluser(user_id,product_id);
    }

    //同意
    @Override
    @Transactional
    public int tongyi(String user_id,String product_id,String start_time,String end_time,String alive_now,String now_product_id,String id,String is_agree){
        pd.adduser(user_id,product_id,start_time,end_time);
        td.update(id,is_agree);
        if(alive_now.equals("1")){
            pd.deluser(user_id,now_product_id);
        }
        return 1;
    }


}
