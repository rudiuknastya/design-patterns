package composite;

public class App {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape circle1 = new Circle(50);
        Shape square = new Square(12);
        Shape triangle = new Triangle(13,15,16);
        Shape shapeGroup = new ShapeGroup();
        ((ShapeGroup) shapeGroup).addShape(circle);
        ((ShapeGroup) shapeGroup).addShape(square);
        ((ShapeGroup) shapeGroup).addShape(triangle);
        ((ShapeGroup) shapeGroup).addShape(circle1);
        shapeGroup.scale(2);
    }
}
