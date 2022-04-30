package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author
 * @Date
 */
public class JdbcTest1 {
    public static void main(String[] args) {
        //DriverManager.registerDriver();注册驱动
        String url = "jdbc:mysql://localhost:3306/tshop?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        String username = "root";
        String password = "123456";
        try {
            Connection conn = DriverManager.getConnection(url,username,password);
            System.out.println(conn);

            Statement stmt = conn.createStatement();
            //String sql = "INSERT INTO sys_user(id,name,password) VALUES('10007','小红','123456')";
            String sql = "update sys_user set name = '小强',password= '123654'where id ='10007";
            int count = (int) stmt.executeUpdate(sql);//向数据库发送执行语句（sql）
            System.out.println(count==1?"操作成功":"操作失败");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
