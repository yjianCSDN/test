package IO流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @Author
 * @Date
 */
public class Conversionflow {
    public static void main(String[] args) throws IOException {
        BufferedReader in = null;

        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入你今天最想说的话");
            String s = in.readLine();
            System.out.println("你最想表达的是"+s);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            if(in!=null){
                in.close();
            }
        }
    }
}
