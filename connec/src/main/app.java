package main;

import java.sql.Connection;
import java.util.Scanner;

import database.config;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter choose : ");
        int x = sc.nextInt();
        Connection conn = config.getConnection();

    }
}
