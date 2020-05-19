/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Circle;
import BT3.Shape.Shape;
/**
 *
 * @author zasx1
 */
public class CircleKhongCan extends Shape{
    private static  CircleKhongCan instance;
    protected CircleKhongCan() {
        
    }
    public static CircleKhongCan createInstance(){
        if(instance == null)
                instance = new CircleKhongCan();
        return instance;
    }
    @Override
    public String draw() {
        return "\nVẽ 1 vòng để ra 1 đường tròn";
    }
}
