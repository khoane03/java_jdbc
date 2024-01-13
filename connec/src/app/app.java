package app;

import java.sql.Connection;
import java.util.Scanner;

import DAO.userDAO;
import database.config;
import model.user;

public class app {
    public static void main(String[] args) {
        user us1 = new user(1,"khoa","lj");
        userDAO.getIntall().insertData(us1);
        userDAO.getIntall().deleteData(us1);



    }
}
