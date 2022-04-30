package Study;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * @Author
 * @Date
 * 日期格式化：使用SimpleDataFormat方法能够将时间的格式修改
 * yyyy 年（年是4位数）
 * MM 月（两位数）
 * dd 日
 * HH 时
 * mm 分
 * ss 秒
 * SSS 毫秒（三位数，最高999秒）
 * 除了这些格式固定之外，其他的格式随意修改也可以
 */
public class TimeFormatting {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd  HH:mm:ss SSS");
        //将当前时间以格式化方式表达出来
        String demo = sdf.format(date);
        System.out.println(demo);

        //String转化为 date
        //将某一个日期按照固定格式输出
        String time =  "2022-3-30 09:11:00 888";
        SimpleDateFormat s = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss SSS");
        //日期的格式要与固定的格式一致，不然无法输出（报错）
        Date datetime = s.parse(time);
        System.out.println(datetime);

        //Date()里面可以放置参数（单位为毫秒）放入的时间为从1970年1月1日0时0分0秒开始加
        //所以我们可以通过System.currentMliis()方法减去或加上一定的毫秒数来得到前天或者明天的时间
        Date B = new Date(System.currentTimeMillis()-1000*60*60*24);
        Date A = new Date(1000);
        SimpleDateFormat sdf2 = new SimpleDateFormat("YYYY-MM-dd  HH:mm:ss SSS");
        String strTime = sdf2.format(A);
        String strTime2 =sdf2.format(B);
        System.out.println(strTime);
        System.out.println(strTime2);

    }
}
