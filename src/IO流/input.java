package IO流;


import java.io.*;

/**
 * @Author
 * @Date
 */
public class input {
    public static void main(String[] args) throws IOException {
    FileWriter fw = new FileWriter("D:\\1\\file.list");
    File file = new File(args[0]);
//    byte [] bytes = new byte[1024];
    File[] files = file.listFiles();
    for(File f:files){
        if(f.getName().endsWith(".mp3")){
            String absolutePath = f.getAbsolutePath();
            fw.write(absolutePath);
            fw.write('\n');
        }
    }
    fw.close();
    }
}