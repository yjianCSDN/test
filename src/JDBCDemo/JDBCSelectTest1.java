package JDBCDemo;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @Author
 * @Date
 */
public class JDBCSelectTest1 {
    public static void main(String[] args) {
        ResourceBundle rs = ResourceBundle.getBundle("JDBCproperties");
        String url = rs.getString("url");
        String username =rs.getString("username");
        String password = rs.getString("password");
        String sql = rs.getString("sql");

        Connection conn = null;
        Statement stmt =null;
        ResultSet r =null;
        try {
            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            //stmt.executeUpdate(sql);//主要用于增删改
            r =stmt.executeQuery(sql) ;//主要用于查询
            while (r.next()){//进行数据库查询循环，将sql所查询的内容全部获取
                int a = r.getInt("id");
                String name = r.getString("name");
                String pwd = r.getString("password");
                System.out.println(a+" "+name+" "+pwd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
