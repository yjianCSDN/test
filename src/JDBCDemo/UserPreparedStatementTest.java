package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

/**
 * @Author
 * @Date
 */
public class UserPreparedStatementTest {
    public static void main(String[] args) {
        ResourceBundle r = ResourceBundle.getBundle("JDBCproperties");
        String url = r.getString("url");
        String username = r.getString("username");
        String password = r.getString("password");
        Connection conn = null;
        PreparedStatement ps = null;
        //增添数据操作
//        try {
//            conn = DriverManager.getConnection(url,username,password);
//            String sql = "INSERT INTO sys_user(id,name,`password`) VALUES(?,?,?)";
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1,10011);
//            ps.setString(2,"zjl");
//            ps.setDouble(3,123456);
//            int result = ps.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //删除数据操作
//        try {
//            conn = DriverManager.getConnection(url,username,password);
//            String sql = "DELETE FROM sys_user where id=?";
//            ps = conn.prepareStatement(sql);
//            ps.setInt(1,10007);
//            int result = ps.executeUpdate();
//            System.out.println(result);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        //修改数据
        try {
            conn = DriverManager.getConnection(url,username,password);
            String sql = "UPDATE sys_user SET name=?,`password`=? where id=?";
            ps = conn.prepareStatement(sql);
            ps.setString(1,"XXX");
            ps.setInt(2,987654);
            ps.setInt(3,10006);
            int result = ps.executeUpdate();
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
