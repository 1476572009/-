package baicheng.bcxiangmuguanli.dao;


import baicheng.bcxiangmuguanli.model.Userjron;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface JournalQueryDao {
    List<Userjron> journalQuery(HashMap hashMap);
}
