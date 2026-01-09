/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Config;

/**
 *
 * @author JustCoFi
 */
import java.sql.*;

public class Conn {
    public static Connection configDB() throws SQLException {
        try {
            String url = "jdbc:mysql://localhost:3306/db_pos";
            String user = "root";
            String pass = "";

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

            // Membuat koneksi
            Connection mysqlConfig = DriverManager.getConnection(url, user, pass);
            return mysqlConfig;
            
        } catch (Exception e) {
            System.err.println("Koneksi Gagal: " + e.getMessage());
        }
        return null;
    }
}
