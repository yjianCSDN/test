package JDBCDemo;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @Author
 * @Date
 */
public class UserLoginTest2 {
    public static void main(String[] args) {
        Map<String,String> map = chushihuaUI();
        boolean ersult = Login(map);
    }

    private static boolean Login(Map<String, String> map) {


        boolean loginSuccess = false;
        ResourceBundle r = ResourceBundle.getBundle("JDBCproperties");
        String user = r.getString("username");
        String pwd = r.getString("password");
        String url = r.getString("url");
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs =null;
        try {
            conn = DriverManager.getConnection(url,user,pwd);
            String sql = "SELECT*FROM sys_user where name=?and password=?";
            //获取预编译的数据库操作对象
            //sql语句的框子。其中一个？表示一个占位符，一个？将来接收一个值，注意：占位符不能使用单括号括起来
            ps =conn.prepareStatement(sql);
            //程序执行到此处，惠发送sql句子给DBMS，然后DBMS进行sql语句的预先编译
            ps.setString(1,map.get("username"));
//            ps.setInt(1,100);这里也可以传类型不为String的值，使用setInt,setDouble等方法
//            ps.setDouble(1,100.0);
            ps.setString(2,map.get("password"));
            //执行sql
            rs = ps.executeQuery();//这里就可以不用传值了，不然又会进行sql语句编译
            if (rs.next()){
                loginSuccess = true;
                System.out.println("登陆成功");
            }else {
                System.out.println("登陆失败，请重试");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if (rs!=null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (ps!=null){
                try {
                    ps.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }


        return loginSuccess;
    }

    private static Map<String, String> chushihuaUI() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String username = sc.nextLine();
        System.out.println("请输入密码");
        String password = sc.nextLine();
        Map map = new HashMap();
        map.put("username",username);
        map.put("password",password);
        return map;
    }


}

