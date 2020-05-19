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
public class TriangleCan extends Shape{
    private static  TriangleCan instance;
    protected TriangleCan() {
        
    }
    public static TriangleCan createInstance(){
        if(instance == null)
                instance = new TriangleCan();
        return instance;
    }
    @Override
    public String draw() {
        return "\nVẽ 2 đường thẳng bằng nhau chung 1 gốc, rồi nối 2 điểm dưới để tạo tam giác cân";
    }
}
