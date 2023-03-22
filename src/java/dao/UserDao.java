package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.User;

public class UserDao extends Dao {

    public UserDao() {
        super();
    }

    public User login(String username, String password) {
        User result = new User();
        String sql = "SELECT * FROM user WHERE username = ? AND password = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result.setUsername(rs.getString("username"));
                result.setUserId(rs.getLong("userId"));
            } else {
                result = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public boolean signup(User user) {
        String sqlCheckUsername = "SELECT username FROM user WHERE username = ?";
        String sql = "INSERT INTO user (username, password) VALUES (?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sqlCheckUsername);
            ps.setString(1, user.getUsername());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                System.out.println(rs.next());
                return false;
            }
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getUsername());
            ps.setString(2, user.getPassword());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
