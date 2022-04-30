package InternetTools;


import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class InterAddress {
    public static void main(String[] args) {


        try {
            //getLocalHost返回本地主机InetAddress对象
            InetAddress myIp = InetAddress.getLocalHost();
            //getHostAddress返回地址IP字符串
            System.out.println("本机IP地址为："+myIp.getHostAddress());
            String i = myIp.getHostName();
            //getHostName方法为返回一个字符串值的主机名
            System.out.println("主机名为："+i);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }




        InetAddress ip = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询IP地址的域名");
        String name = sc.next();
        try {
            ip = InetAddress.getByName(name);
            System.out.println("所查询的IP域名为："+ip+"地址：为"+ip.getHostAddress());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
