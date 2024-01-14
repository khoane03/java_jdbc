package model;

import java.util.Scanner;

import DAO.userDAO;

public class menu {
    public static void listMenu() {
        System.out.println("-----Menu-----");
        System.out.println("- 1: Thêm dữ liệu");
        System.out.println("- 2: Sửa dữ liệu");
        System.out.println("- 3: Xoá dữ liệu");
        System.out.println("- 4: Hiển thị dữ liệu");
        System.out.println("- 0: Thoát ");
        System.out.println("--------------");
    }

    public static void logicMenu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời bạn nhập lựa chọn : ");
        int option = sc.nextInt();
        if (option == 0) {
            System.out.println("Bạn đã thoát chương trình !");
        }
        if (option == 1) {
            System.out.println("Nhập đữ liệu bạn muốn thêm ");
            System.out.print("Tên tài khoản : ");
            String user = sc.nextLine();
            System.out.print("Mật khẩu : ");
            String pass = sc.nextLine();
            user us = new user(user, pass);
            userDAO.getIntall().insertData(us);
            userDAO.getIntall().selectData(us);
            logicMenu();
        }
        if (option == 2) {

            System.out.print("Nhập dữ liệu cập nhật: ");
            System.out.print("Nhập id : ");
            int id = sc.nextInt();
            System.out.print("Tên tài khoản : ");
            String user = sc.nextLine();
            System.out.print("Mật khẩu : ");
            String pass = sc.nextLine();
            user us = new user(id, user, pass);
            userDAO.getIntall().updateData(us);
            userDAO.getIntall().selectData(us);
            logicMenu();
        }
        if (option == 3) {

            System.out.print("Nhập id bạn muốn xoá : ");
            int temp = sc.nextInt();
            user us = new user(temp, null, null);
            userDAO.getIntall().deleteData(us);
            userDAO.getIntall().selectData(us);
            logicMenu();
        }
        if (option == 4) {
            user us = new user();
            userDAO.getIntall().selectData(us);
            logicMenu();
        }
    }
}
