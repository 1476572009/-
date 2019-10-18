package baicheng.bcxiangmuguanli.dao;


import baicheng.bcxiangmuguanli.model.Userjron;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface logAdd {
    int LogAdd(Userjron userjron);
}
