package command;

public class Rotate implements Command{
    private Shape shape;
    private int angle;

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }

    @Override
    public void execute() {
        shape.rotate(angle);
    }
}
