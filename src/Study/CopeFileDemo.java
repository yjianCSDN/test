package Study;

import java.io.*;

/**
 * @Author
 * @Date
 * 将一个文件夹下的文件目录复制到新的一个地方
 */
public class CopeFileDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\86189\\Desktop\\Study");
        File newFile = new File("D:");
        copy(file,newFile);


    }

    private static void copy(File file, File newFile) {
        if (file.isFile()){
            FileInputStream fis = null;
            FileOutputStream fos = null;
            try {
                fis = new FileInputStream(file);
                String path = newFile.getAbsolutePath()+file.getAbsolutePath().substring(3);
                fos = new FileOutputStream(path);

                byte[] bytes = new byte[1024*1024];//一次传递速度为1m
                int i =0;
                while((i=fis.read(bytes))!=-1){
                    fos.write(bytes,0,i);
                }
                fos.flush();//为了防止输出流中仍有残余，需要使用flush方法进行全部输出
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }return;
        }
        File[]files =  file.listFiles();
        for (File f:files){
            //查看所有文件的绝对路径（包括目录跟文件）绝对路径
            //System.out.println(f.getAbsolutePath());
            if (f.isDirectory()){
                //新建对应的目录
                String file1= f.getAbsolutePath();
                //System.out.println(file1);
                String file2 =  newFile.getAbsolutePath()+file1.substring(3);
                File file3 = new File(file2);
                if (!file3.exists()){
                    file3.mkdirs();//建立多级文件夹，而mkdir只能创建单层文件夹
                }
                //System.out.println(file2);
            }
            //递归调用方法，防止会有子文件夹没有显示出来
            copy(f,newFile);
        }

    }
}
