package com.Banking.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
    public static Connection con;
    public static Connection getConection() throws SQLException {
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb","root","root");

        return con;

    }
}
