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
public class CircleCan extends Shape{

    private static  CircleCan instance;
    protected CircleCan() {
        
    }
    public static CircleCan createInstance(){
        if(instance == null)
                instance = new CircleCan();
        return instance;
    }
    @Override
    public String draw() {
        return "\nVẽ vòng tròn một góc 360 độ để ra hình tròn";
    }
    
}
