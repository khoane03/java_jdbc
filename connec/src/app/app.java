package app;

import java.sql.Connection;

import DAO.userDAO;
import database.config;
import model.menu;
import model.user;

public class app {
    public static void main(String[] args) {
        menu.listMenu();
        menu.logicMenu();
    }
}
