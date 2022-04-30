package Study;

import org.omg.CORBA.DATA_CONVERSION;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author
 * @Date
 */
public class time {
    public static void main(String[] args) {
        System.out.println(A("2000.06.00 22:25:03",6));
    }

    public static String A(String time, int X) {
        SimpleDateFormat A = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        Date riqi=null;
        try{
            riqi=A.parse(time);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        if (riqi==null){
            System.out.println("输入的日期有误！");
        }
        System.out.println("修改前的时间"+A.format(riqi));
        Calendar cal = Calendar.getInstance();
        cal.setTime(riqi);
        cal.add(Calendar.HOUR,X);
        riqi=cal.getTime();
        System.out.println("修改后的时间为"+A.format(riqi));
        cal=null;
        return A.format(riqi);
    }
}


