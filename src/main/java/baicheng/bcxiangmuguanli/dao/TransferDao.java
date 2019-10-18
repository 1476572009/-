package baicheng.bcxiangmuguanli.dao;

import baicheng.bcxiangmuguanli.model.Transfer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TransferDao {

    //查询申请
    public List<Transfer> query(String boss);

    //提交申请
    public int add(Transfer transfer);

    //审核申请
    public int update(@Param("id")String id,@Param("is_agree")String is_agree);
}
