/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3.Factory;
import BT3.Shape.Shape;
import BT3.Shape.ShapeType;

/**
 *
 * @author zasx1
 */
public abstract class ShapeFactory {
    protected abstract Shape createShape(ShapeType shapeType);
    public Shape orderShape(ShapeType shapeType){
        Shape shape = createShape(shapeType);
        shape.draw();
        return shape;
    }
}
