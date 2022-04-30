package Study;

import com.sun.jndi.cosnaming.IiopUrl;
import com.sun.xml.internal.ws.wsdl.writer.document.http.Address;

import java.util.Date;

/**
 * @Author
 * @Date
 * System.currentTimeMills()方法是获取从1970年1月1日0时0分0秒到现在的总毫秒数
 *
 */
public class GetTime {
    public static void main(String[] args) {


        Date date = new Date();
        long begin = System.currentTimeMillis();
        for (int i =0 ;i<100000;i++){}
        long end = System.currentTimeMillis();
        //通过使用两次System.currentTimeMills方法获得一个方法执行的时间
        System.out.println(end-begin);
    }

}
