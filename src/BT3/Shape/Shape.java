/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Shape;

/**
 *
 * @author zasx1
 */
public abstract class Shape {
    String brush = "bút chì", paper = "giấy trắng", frame = "khung cứng";
    
    public abstract String draw();

    @Override
    public String toString() {
        return "Chuẩn bị: " + brush + ", " + paper + ", " + frame+ "\n" + draw();
    }
    
}
