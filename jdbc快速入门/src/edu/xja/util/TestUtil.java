package edu.xja.util;

import java.sql.Connection;
import java.sql.SQLException;

public class TestUtil {
    public static void main(String[] args) throws SQLException {
        Connection connection = JdbcUtils.getConnection();
        System.out.println(connection);
    }
}
