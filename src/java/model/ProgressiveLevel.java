/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author doduc
 */
public class ProgressiveLevel {
    private int id;
    private int level;
    private int quantity;
    private int price;
    private String type;

    public ProgressiveLevel() {
    }

    public ProgressiveLevel(int id, int level, int quantity, int price, String type) {
        this.id = id;
        this.level = level;
        this.quantity = quantity;
        this.price = price;
        this.type = type;
    }

    public ProgressiveLevel(int level, int quantity, int price, String type) {
        this.quantity = quantity;
        this.price = price;
        this.type = type;
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
}
