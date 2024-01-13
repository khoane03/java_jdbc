package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

import database.config;
import model.user;
public class userDAO implements DAOInterfaces<user> {
    public static userDAO getIntall(){
        return new userDAO();
    }

    @Override
    public int deleteData(user t) {
        Connection conn = config.getConnection();
        String sqlQuery = "DELETE FROM users WHERE idUser = ?";
        System.out.println(sqlQuery);
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuery);
            stm.setInt(0, 1);
            int rowCheck = stm.executeUpdate();
        } catch (SQLException e) {
           
            e.printStackTrace(); 
        }
        return 0;
    }

    @Override
    public int insertData(user t) {
        Connection conn = config.getConnection();
        String sqlQuery = "INSERT INTO users(userName,passWord) VALUES (?,?);";
        System.out.println(sqlQuery);
        try {
            PreparedStatement stm = conn.prepareStatement(sqlQuery);
            stm.setString(0, "Lan15");
            stm.setString(0, "Lan1510");

            int rowCheck = stm.executeUpdate();
        } catch (SQLException e) {
           
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int selectData(user t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int updateData(user t) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static void deleteData() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteData'");
    }
    
    
    
}
