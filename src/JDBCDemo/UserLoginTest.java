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
public class UserLoginTest {
    public static void main(String[] args) {
        Map<String,String> map = chushihuaUI();
        boolean ersult = Login(map);
    }

    private static boolean Login(Map<String, String> map) {
//    String yrl = "";
//    String username

        boolean loginSuccess = false;
        ResourceBundle r = ResourceBundle.getBundle("JDBCproperties");
        String user = r.getString("username");
        String pwd = r.getString("password");
        String url = r.getString("url");
        System.out.println(map.get("username"));
        System.out.println(map.get("password"));
        String sql = "SELECT*FROM sys_user where name='"+map.get("username")+"'and password='"+map.get("password")+"'";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs =null;
        try {
            conn = DriverManager.getConnection(url,user,pwd);
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
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
            if (stmt!=null){
                try {
                    stmt.close();
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
