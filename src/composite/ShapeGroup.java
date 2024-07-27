package composite;

import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape{
    private List<Shape> shapes = new ArrayList<Shape>();
    @Override
    public void scale(int coef) {
        for(Shape shape: shapes){
            shape.scale(coef);
        }
    }
    public void addShape(Shape shape){
        shapes.add(shape);
    }
    public void removeShape(Shape shape){
        shapes.remove(shape);
    }
}
