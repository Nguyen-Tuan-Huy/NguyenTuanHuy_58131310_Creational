/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Triangle;
import BT3.Shape.Shape;
/**
 *
 * @author zasx1
 */
public class TriangleKhongCan extends Shape{
        private static  TriangleKhongCan instance;
    protected TriangleKhongCan() {
        
    }
    public static TriangleKhongCan createInstance(){
        if(instance == null)
                instance = new TriangleKhongCan();
        return instance;
    }
    @Override
    public String draw() {
        return "\nVẽ 3 điểm bất kì để tạo ra một tam giác";
    }
    
}
