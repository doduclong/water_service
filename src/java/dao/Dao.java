package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dao {

    public static Connection con;

    public Dao() {
        if (con == null) {
            String dbUrl = "jdbc:mysql://localhost:3306/water_service";
            String dbClass = "com.mysql.jdbc.Driver";

            try {
                Class.forName(dbClass);
                con = DriverManager.getConnection(dbUrl, "root", "1234");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }
}
