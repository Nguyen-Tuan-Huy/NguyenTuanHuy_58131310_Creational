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
public class RectangleCan extends Shape{
        private static RectangleCan instance;
    protected RectangleCan() {
        
    }
    public static RectangleCan createInstance(){
        if(instance == null)
                instance = new RectangleCan();
        return instance;
    }
    @Override
    public String draw() {
        return "\nVẽ hình chữ nhật sao cho 4 cạnh bằng nhau để tạo ra hình vuông";
    }
}
