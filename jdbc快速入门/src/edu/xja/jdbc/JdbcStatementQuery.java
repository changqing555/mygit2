package edu.xja.jdbc;

import java.sql.*;

public class JdbcStatementQuery {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1注册驱动
        //5之后可以不用自己注册，
        Class.forName("com.mysql.jdbc.Driver");
        //2获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        //以下是本机数据连接的简写
        //Connection conn = DriverManager.getConnection("jdbc:mysql:///test","root","root");
        //编写sql
        String sql = "select * from user";
        Statement statement = conn.createStatement();
        //执行sql
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){
            String username = resultSet.getString("username");
            System.out.println(username);
        }
        resultSet.close();
        statement.close();
        conn.close();

    }
}
