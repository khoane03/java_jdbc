package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.config;
import model.user;

public class userDAO implements DAOInterfaces<user> {
    public static userDAO getIntall() {
        return new userDAO();
    }

    @Override
    public int deleteData(user t) {
        Connection conn = config.getConnection();
        String sqlQuery = "DELETE FROM users WHERE idUser = ? ;";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuery);
            stm.setInt(1, t.getId());
            int rowCheck = stm.executeUpdate();
            if(rowCheck!=0){
                System.out.println("Xoá dữ liệu thành công !");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int insertData(user t) {
        Connection conn = config.getConnection();
        String sqlQuery = "INSERT INTO users(userName,passWord) VALUES (?,?);";
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuery);
            stm.setString(1, t.getUserName());
            stm.setString(2, t.getPassWord());

            int rowCheck = stm.executeUpdate();
            if(rowCheck!=0){
                System.out.println("Thêm dữ liệu thành công !");
            }
        } catch (SQLException e) {

            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int updateData(user t) {
        Connection conn = config.getConnection();
        String sqlQuery = "UPDATE users SET userName = ?, passWord = ? WHERE idUser = ?;";
        try {
            PreparedStatement prt = conn.prepareStatement(sqlQuery);
            prt.setInt(3, t.getId());
            prt.setString(1, t.getUserName());
            prt.setString(2, t.getPassWord());
            int check = prt.executeUpdate();
            if(check!=0){
                System.out.println("Cập nhật dữ liệu thành công !");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

    @Override
    public int selectData(user t) {
        Connection conn = config.getConnection();
        String sqlQuery = "SELECT * FROM users;";
        try {
            PreparedStatement prt = conn.prepareStatement(sqlQuery);
            ResultSet rc = prt.executeQuery();
            System.out.println("------------------------------------------");
            System.out.println("--id--Tài khoản--Mật khẩu--");
            while (rc.next()) {
                int id = rc.getInt(1);
                String userName = rc.getString(2);
                String password = rc.getString(3);
                System.out.println("-" + id + "-" + userName + "-" + password);
            }
            System.out.println("------------------------------------------");

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }

}
