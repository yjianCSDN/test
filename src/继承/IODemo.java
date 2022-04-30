import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IODemo {
    public static void main(String[] args) {
        FileReader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader("D:\\QQdownlord\\911617191\\FileRecv\\01-10.md");//绝对路径
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            fr.read();
            int d = fr.read();
            int a = fr.read();
            int b = fr.read();
            int c = fr.read();
            System.out.println((char)d);
            System.out.println(a);
            System.out.println(b);
            System.out.println((char) c);
            int e = 0;

            while ((e=fr.read())!=-1){
                System.out.println(e);
            }
//            按行读
            /*br = new BufferedReader(fr);//包装流
            String line="";
            while((line=br.readLine())!=null){
                System.out.println(line);
            }*/
            /*int a=0;
            int b=0;
            while((a=fr.read())!=-1){
                b++;
                System.out.println(b);
                System.out.println((char) a);
            }*/
            /*while(true){
                int a=fr.read();
                System.out.print((char)a);
                if(a==-1){
                    break;
                }
            }*/
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
