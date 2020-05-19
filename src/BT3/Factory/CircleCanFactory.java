/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Factory;

import BT3.Circle.CircleCan;
import BT3.Circle.CircleKhongCan;
import BT3.Shape.Shape;
import BT3.Shape.ShapeType;

/**
 *
 * @author zasx1
 */
public class CircleCanFactory extends ShapeFactory{

    @Override
    protected Shape createShape(ShapeType shapeType) {
        switch(shapeType)
        {
            case can: return  CircleCan.createInstance();
            case khongcan: return CircleKhongCan.createInstance();
        }
        return null;
    }
    
    
}
