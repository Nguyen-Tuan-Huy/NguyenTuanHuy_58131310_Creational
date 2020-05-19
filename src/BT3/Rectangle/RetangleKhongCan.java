/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Rectangle;
import BT3.Shape.Shape;
/**
 *
 * @author zasx1
 */
public class RetangleKhongCan extends Shape{
        private static RetangleKhongCan instance;
    protected RetangleKhongCan() {
        
    }
    public static RetangleKhongCan createInstance(){
        if(instance == null)
                instance = new RetangleKhongCan();
        return instance;
    }
    @Override
    public String draw() {
        return "\nVẽ 2 tứ giác có 2 cạnh đối bằng nhau";
    }
    
}
