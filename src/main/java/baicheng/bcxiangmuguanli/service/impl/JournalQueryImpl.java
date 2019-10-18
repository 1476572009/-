package baicheng.bcxiangmuguanli.service.impl;

import baicheng.bcxiangmuguanli.dao.JournalQueryDao;
import baicheng.bcxiangmuguanli.model.Userjron;
import baicheng.bcxiangmuguanli.service.JournalQueryInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class JournalQueryImpl implements JournalQueryInterface {
    @Autowired
    JournalQueryDao j;
    @Override
    public List<Userjron> journalQuery(HashMap hashMap) {
        return j.journalQuery(hashMap);
    }
}
