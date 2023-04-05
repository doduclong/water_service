/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.Dao.con;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Customer;
import model.ProgressiveLevel;

/**
 *
 * @author doduc
 */
public class ConfigurationDao extends Dao{

    public ConfigurationDao() {
        super();
    }
    
    public ArrayList<ProgressiveLevel> getAllProgressiveLevel() {
        String sql = "SELECT * FROM progressive_level";
        ArrayList<ProgressiveLevel> result = new ArrayList<>();
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ProgressiveLevel progressiveLevel = new ProgressiveLevel();
                progressiveLevel.setId(rs.getInt("id"));
                progressiveLevel.setLevel(rs.getInt("level"));
                progressiveLevel.setQuantity(rs.getInt("quantity"));
                progressiveLevel.setPrice(rs.getInt("price"));
                progressiveLevel.setType(rs.getString("type"));
                result.add(progressiveLevel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
    public ProgressiveLevel getProgressiveLevelById(int id){
        String query = "SELECT * FROM progressive_level WHERE id=?";
        ProgressiveLevel progressiveLevel = new ProgressiveLevel();
        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            System.out.println(rs);
            while (rs.next()) {
                progressiveLevel.setId(rs.getInt("id"));
                progressiveLevel.setLevel(rs.getInt("level"));
                progressiveLevel.setQuantity(rs.getInt("quantity"));
                progressiveLevel.setPrice(rs.getInt("price"));
                progressiveLevel.setType(rs.getString("type"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return progressiveLevel;
    }
    
    public void updateProgressiveLevel(int id, int level, int quantity, int price, String type){
        String query = "UPDATE progressive_level SET level=?, quantity=?, price=?, type=? WHERE id=?";
        try{
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, level);
            ps.setInt(2, quantity);
            ps.setInt(3, price);
            ps.setString(4, type);
            ps.setInt(5, id);
            ps.executeUpdate();
        }catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
