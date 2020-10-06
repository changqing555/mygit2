package edu.xja.jdbc;

import java.sql.*;

public class JdbcStatementUpdate {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //2获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        //编写sql
        String sql = "update user set username='姓名' where id=1";
        Statement statement = conn.createStatement();
        //执行sql
        int resultSet = statement.executeUpdate(sql);
        System.out.println(resultSet);
        statement.close();
        conn.close();

    }
}
