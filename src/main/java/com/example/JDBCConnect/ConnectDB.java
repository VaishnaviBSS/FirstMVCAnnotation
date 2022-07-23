package com.example.JDBCConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "sathyvaram");
            if (connection != null) {
                System.out.println("The connection is established");
            } else {

                System.out.println("Bad connection");
            }
        } catch (Exception e) {

            System.out.println(e);
        }

    }
}
