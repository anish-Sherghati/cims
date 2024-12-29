package org.example.cims.utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class CIMSDB {

    public static Connection provideConnection() {
        Connection conn = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String url = "jdbc:mariadb://localhost:3306/cimsdb";

        try {
            conn = DriverManager.getConnection(url, "root", "example");
        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }

}
