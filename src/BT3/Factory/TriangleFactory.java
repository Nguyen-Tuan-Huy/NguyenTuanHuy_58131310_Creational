/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Factory;
import BT3.Shape.Shape;
import BT3.Shape.ShapeType;
import BT3.Triangle.TriangleCan;
import BT3.Triangle.TriangleKhongCan;
/**
 *
 * @author zasx1
 */
public class TriangleFactory extends ShapeFactory{
 
        @Override
    protected Shape createShape(ShapeType shapeType) {
        switch(shapeType)
        {
            case can: return  TriangleCan.createInstance();
            case khongcan: return TriangleKhongCan.createInstance();
        }
        return null;
    }
}
