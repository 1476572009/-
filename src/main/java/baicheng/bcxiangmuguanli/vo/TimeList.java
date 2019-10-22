package baicheng.bcxiangmuguanli.vo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TimeList {
    public static List getList(String start_time,String end_time){
        List<Date> list = new ArrayList<Date>();
        Calendar tempStart = Calendar.getInstance();
        DateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd");
        try{
            Date beginDate = dateFormat1.parse(start_time);
            Date endDate = dateFormat1.parse(end_time);
            tempStart.setTime(beginDate);
            while(beginDate.getTime()<=endDate.getTime()){
                String str = (new SimpleDateFormat("yyyy-MM-dd")).format(tempStart.getTime());
                list.add(tempStart.getTime());
                tempStart.add(Calendar.DAY_OF_YEAR, 1);
                beginDate = tempStart.getTime();
            }


        }catch (Exception e){

        }
        return list;
    }
}
