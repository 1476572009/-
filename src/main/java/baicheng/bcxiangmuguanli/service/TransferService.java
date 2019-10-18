package baicheng.bcxiangmuguanli.service;

import baicheng.bcxiangmuguanli.model.Transfer;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TransferService {
    //查询申请
    public List<Transfer> query(String boss);

    //提交申请
    public int add(Transfer transfer);

    public int update(String id,String is_agree);
}
