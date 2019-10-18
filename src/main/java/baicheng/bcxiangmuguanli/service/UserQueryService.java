package baicheng.bcxiangmuguanli.service;







import baicheng.bcxiangmuguanli.model.UserLi;

import java.util.List;

public interface UserQueryService {
    List<UserLi> userQuery(String id);
}
