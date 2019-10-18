package baicheng.bcxiangmuguanli.service;



import baicheng.bcxiangmuguanli.model.Userjron;

import java.util.HashMap;
import java.util.List;

public interface JournalQueryInterface {
    List<Userjron> journalQuery(HashMap hashMap);
}
