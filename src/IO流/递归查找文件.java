package IO流;

import java.io.File;

/**
 * @Author
 * @Date
 */
public class 递归查找文件 {
    public static void main(String[] args) {
        String fileName="C:\\Users\\86189\\Desktop\\1"+File.separator;
        File f=new File(fileName);
        print(f);
    }
    public static void print(File f){
        if(f!=null){
            if(f.isDirectory()){
                File[] fileArray=f.listFiles();
                if(fileArray!=null){
                    for (int i = 0; i < fileArray.length; i++) {
                        //递归调用
                        print(fileArray[i]);
                    }
                }
            }
            else{
                System.out.println(f);
            }
        }
    }
}
