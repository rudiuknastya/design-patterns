package command;

public class Cube implements Shape{
    private int sideLenght;

    public Cube(int sideLenght) {
        this.sideLenght = sideLenght;
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Cube rotated on "+angle +" degrees");
    }

    @Override
    public void move(int x, int y, int z) {
        System.out.println("Cube moved on "+x+" mm along the x axis, "+y+" mm along the y axis and "+z +" mm along the z axis");
    }
}
