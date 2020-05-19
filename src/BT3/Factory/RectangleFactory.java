/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Factory;
import BT3.Shape.Shape;
import BT3.Shape.ShapeType;
import BT3.Rectangle.RectangleCan;
import BT3.Rectangle.RetangleKhongCan;
/**
 *
 * @author zasx1
 */
public class RectangleFactory extends ShapeFactory{
    
        @Override
    protected Shape createShape(ShapeType shapeType) {
        switch(shapeType)
        {
            case can: return  RectangleCan.createInstance();
            case khongcan: return RetangleKhongCan.createInstance();
        }
        return null;
    }
}
