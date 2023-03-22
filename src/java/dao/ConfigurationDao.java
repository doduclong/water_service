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
                progressiveLevel.setLevel(rs.getInt("level"));
                progressiveLevel.setQuantity(rs.getInt("quantity"));
                progressiveLevel.setPrice(rs.getInt("price"));
                result.add(progressiveLevel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    
}
