/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.main;
import BT3.Shape.Shape;
import BT3.Factory.CircleCanFactory;
import BT3.Factory.ShapeFactory;
import BT3.Factory.TriangleFactory;
import BT3.Shape.ShapeType;
/**
 *
 * @author zasx1
 */
public class Shapemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory circle = new CircleCanFactory();
        Shape shape = circle.orderShape(ShapeType.khongcan);
        System.out.println(shape.toString());
        
        ShapeFactory triangle = new TriangleFactory();
        Shape shape2 = triangle.orderShape(ShapeType.can);
        System.out.println(shape2.toString());
    }
    
}
