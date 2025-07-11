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
import user_profile.UserSession;

public class SignupHandler {

    public static boolean isUsernameOrEmailTaken(String username, String email) throws SQLException {
        Connection conn = DB_conn.getConnection();
        String query = "SELECT * FROM user WHERE username = ? OR email = ?";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Username or email already exists
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Username and email are available
    }

    public static boolean registerUser(String username, String email, String password) throws SQLException {
        if (isUsernameOrEmailTaken(username, email)) {
            return false; // Username or email already taken
        }

        Connection conn = DB_conn.getConnection();
        String query = "INSERT INTO user (username, email, password, created_date, last_login_date) VALUES (?, ?, ?, NOW(), NOW())";

        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, username);
            ps.setString(2, email);
            ps.setString(3, password);
            int rowsInserted = ps.executeUpdate();

            if (rowsInserted > 0) {
                User user = new User(username, email);
                UserSession.getInstance().setUser(user); // Set the user in UserSession
                return true; // // User registered successfully
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // Registration failed
    }
}