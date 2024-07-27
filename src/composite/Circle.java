package composite;

public class Circle implements Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void scale(int coef) {
        System.out.println("Now circle with radius " + radius*coef);
    }
}
