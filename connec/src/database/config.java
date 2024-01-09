package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class config {

    public static Connection getConnection() {
        final String url = "jdbc:mysql://localhost:3307/testJdbc";
        final String userName = "root";
        final String passWord = "Khoa1002@";
        // Create variable Conn
        Connection conn = null;
        try {
            //
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, userName, passWord);
            System.out.println("Connect successfully!");
        } catch (Exception e) {
            System.out.println("Connect failure!");
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConn(Connection c) {
        try {
            if (c != null) {
            c.close();
        }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void addData(Connection c){
        try {
            Statement st = c.createStatement();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
