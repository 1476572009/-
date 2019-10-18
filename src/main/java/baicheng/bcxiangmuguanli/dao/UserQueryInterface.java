package baicheng.bcxiangmuguanli.dao;



import baicheng.bcxiangmuguanli.model.UserLi;
import baicheng.bcxiangmuguanli.model.Userjron;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserQueryInterface {
    List<UserLi> userQuery(String id);
    int LogAdd(Userjron userjron);
}
