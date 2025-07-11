/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbhandlers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import packs.DB_conn;
import user_profile.User;

public class LoginHandler {

    public static User authenticate(String usernameOrEmail, String password) throws SQLException {
        Connection conn = DB_conn.getConnection();
        String query = "SELECT * FROM user WHERE (username = ? OR email = ?) AND password = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, usernameOrEmail);
            ps.setString(2, usernameOrEmail);
            ps.setString(3, password);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                // User found with the given username/email and password
                updateLastLoginDate(usernameOrEmail);
                String username = rs.getString("username");
                String email = rs.getString("email");
                return new User(username, email);
//                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
//        return false;
        return null; // Authentication failed
    }
    
    private static void updateLastLoginDate(String usernameOrEmail) throws SQLException {
        Connection conn = DB_conn.getConnection();
        String query = "UPDATE user SET last_login_date = NOW() WHERE username = ? OR email = ?";
        
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, usernameOrEmail);
            ps.setString(2, usernameOrEmail);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
