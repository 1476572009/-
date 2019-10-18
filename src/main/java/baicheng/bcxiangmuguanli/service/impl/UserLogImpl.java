package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.UserQueryInterface;

import baicheng.bcxiangmuguanli.model.Userjron;
import baicheng.bcxiangmuguanli.service.UserLogInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLogImpl implements UserLogInterface {
@Autowired
UserQueryInterface l;
    @Override
    public int LogAdd(Userjron userjron) {
        return l.LogAdd(userjron);
    }
}
