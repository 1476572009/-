package baicheng.bcxiangmuguanli.service.impl;



import baicheng.bcxiangmuguanli.dao.UserQueryInterface;
import baicheng.bcxiangmuguanli.model.UserLi;
import baicheng.bcxiangmuguanli.service.UserQueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserQueryImpl implements UserQueryService {
    @Autowired
    UserQueryInterface s;

    @Override
    public List<UserLi> userQuery(String id) {
        return s.userQuery(id);
    }
}
