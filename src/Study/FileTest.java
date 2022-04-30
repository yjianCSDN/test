package Study;

import java.io.*;

/**
 * @Author
 * @Date
 */
public class FileTest {
    public static void main(String[] args) {
        FileInputStream is =null;
        FileOutputStream os = null;
        File file = new File("C:\\Users\\86189\\Desktop\\1\\3.txt");
        File file1 = new File("C:\\Users\\86189\\Desktop\\1\\4.txt");
        File file2 = new File("C:\\Users\\86189\\Desktop\\1\\5\\6\\7\\8\\9");
        try {
            file.createNewFile();//创建一个文件形式的file
            if (!file1.exists()){//盘读研文件是否存在
                file1.mkdir();//创建一个名为file1的文件夹

            }
             file2.mkdirs();//创建一个名为file1的文件夹，以多重目录的形式创建
            System.out.println(file2.getParent());//获取父路径
            System.out.println(file.getAbsolutePath());//获取绝对路径

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        File file3 = new File("C:\\Users\\86189\\Desktop\\Study\\test.txt");
         File[]files = file3.listFiles();//获取该文件夹下的全部子文件名称
         for (File f:files){

             System.out.println(f.getAbsolutePath());

         }
//        try {
//            is = new FileInputStream(String.valueOf(files));
//            os = new FileOutputStream(file2);
//            byte []bytes = new byte[1024];
//            int i =0;
//            while((i=is.read(bytes))!=-1){
//                os.write(bytes,0,i);
//                os.flush();
//            }
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } try {
//            is.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        try {
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
}
