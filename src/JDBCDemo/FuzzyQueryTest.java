package JDBCDemo;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @Author
 * @Date
 */
public class FuzzyQueryTest {
    public static void main(String[] args) {
        ResourceBundle r = ResourceBundle.getBundle("JDBCproperties");
        String url = r.getString("url");
        String username = r.getString("username");
        String pwd = r.getString("password");
        String sql = "SELECT * FROM sys_user where name =?";
        Connection conn =null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection(url,username,pwd);
            ps = conn.prepareStatement(sql);
            ps.setString(1,"_o%");
            rs = ps.executeQuery();
            System.out.println("1");
            while (rs.next()){
                String a = rs.getString("name");
                System.out.println(a);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
