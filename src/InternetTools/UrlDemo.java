package InternetTools;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class UrlDemo {
    public static void main(String[] args) {
        BufferedReader in = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个网址的链接");
        String u = sc.next();
        System.out.println("请输入要查询的标签的内容");
        String l = sc.next();
        try {
            URL url = new URL(u);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            String s;
            while ((s = in.readLine())!=null){
                if(s.contains(l)){
                    System.out.println(s);
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
