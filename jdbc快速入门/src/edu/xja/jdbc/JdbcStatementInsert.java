package edu.xja.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcStatementInsert {
    public static void main(String[] args) {
        Connection conn = null;
        Statement statement = null;
        try {
            //1注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2获取数据库连接对象
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
            //编写sql
            String sql = "insert into user values (10,'明细','11','6187212687',null,'男',null,null)";
            statement = conn.createStatement();
            //执行sql
            int resultSet = statement.executeUpdate(sql);
            System.out.println(resultSet);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (statement != null){
                    statement.close();
                 }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
