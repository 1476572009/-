package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.ProductDao;
import baicheng.bcxiangmuguanli.dao.TransferDao;
import baicheng.bcxiangmuguanli.dao.UserDao;
import baicheng.bcxiangmuguanli.model.Product;
import baicheng.bcxiangmuguanli.service.ProductService;
import baicheng.bcxiangmuguanli.vo.TimeList;
import baicheng.bcxiangmuguanli.vo.User_Product;
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
    @Autowired
    UserDao ud;

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
    public int tongyi(String user_id,String user_name,String product_id,String product_name,String start_time,String end_time,String alive_now,String now_product_id,String id,String is_agree){
        pd.adduser(user_id,product_id,start_time,end_time);
        td.update(id,is_agree);
        List list = TimeList.getList(start_time,end_time);
        ud.updateusertime(user_id,product_id,list,"1");
        List list1=ud.selectall(user_name,product_name,null,null);
        User_Product u= (User_Product) list.get(0);
        List list2=TimeList.getList(u.getStarttime(),u.getEndtime());
        if(alive_now.equals("1")){
            pd.deluser(user_id,now_product_id);
            ud.updateusertime(user_id,now_product_id,list2,"0");
        }
        return 1;
    }


}
