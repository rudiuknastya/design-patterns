package command;

public class Sphere implements Shape{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Sphere rotated on "+angle +" degrees");
    }

    @Override
    public void move(int x, int y, int z) {
        System.out.println("Sphere moved on "+x+" mm along the x axis, "+y+" mm along the y axis and "+z +" mm along the z axis");
    }
}
