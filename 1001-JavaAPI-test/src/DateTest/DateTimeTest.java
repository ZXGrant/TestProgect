package DateTest;

import utils.TimeUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 信息说明
 * <pre>
 * Modify Information:
 * Author          Date          Description
 * ============   ============= ============================
 * ZhangXingguang  2019/8/22       Create
 * </pre>
 */
public class DateTimeTest {
    public static void main(String[] args) throws ParseException{
        /**
         * 1、比较两个时间的大小，把时间转换成字符串，在比较
         */
        String time0="20190824104152";
        String time1=time0.substring(0,8);
        String time2="20190823";

       /* if(Integer.parseInt(time)>=Integer.parseInt(time2)){
            System.out.println("t1 >>>>>>");
        }*/

       if(time1.compareTo(time2)>=0){
           System.out.println("1>>>>>>>>>2");
       }

       String[] args1=new String[]{"4520","20190916163955500"};

       //getFromToTime(args1);
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getTime());



    }

    /**
     *1、这个Calander对象其实很好的提现了面向对象的思维
     */
    public static String[] getFromToTime(String[] arguments) throws ParseException {
        Calendar calendar = Calendar.getInstance();
        // 若参数大于1，则指定结束时间
        if (arguments.length > 1) {
            String date = arguments[1];
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            sdf.setLenient(false);
            calendar.setTime(sdf.parse(date));

        }

        calendar.add(Calendar.MINUTE, -20);
        calendar.set(Calendar.MILLISECOND, 0);

        String toTime = TimeUtil.getFormattedDate(calendar.getTime(), TimeUtil.PATTERN_TIME17);
        calendar.add(Calendar.DAY_OF_MONTH, -1);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        String fromTime = TimeUtil.getFormattedDate(calendar.getTime(), TimeUtil.PATTERN_TIME17);

        System.out.println(fromTime+"------"+toTime);
        return new String[] { fromTime, toTime };
    }

}
