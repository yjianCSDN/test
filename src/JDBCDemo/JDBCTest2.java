package JDBCDemo;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @Author
 * @Date
 * 利用properties文件来获取属性链接数据库
 */
public class JDBCTest2 {
    public static void main(String[] args) {
        ResourceBundle rs = ResourceBundle.getBundle("JDBCproperties");
        String url = rs.getString("url");
        String username =rs.getString("username");
        String password = rs.getString("password");
        String sql = rs.getString("sql");
//        String url ="jdbc:mysql://localhost:3306/tshop?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
//        String username = "root";
//        String password = "123456";
        Connection conn = null;
        Statement stmt = null;
//        String sql = "INSERT INTO sys_user(id,name,password) VALUES('10008','Solomon_Yuudachi','123456')";
        ResultSet r = null;
        try {
            conn = DriverManager.getConnection(url,username,password);
            stmt = conn.createStatement();
            int i = stmt.executeUpdate(sql);
//            r =stmt.executeQuery(sql);
            System.out.println(i == 1?"修改成功":"修改失败");
            System.out.println(conn);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            //使用完成之后记得释放资源
            if (r!=null){
                try {
                    r.close();
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
    }
}
