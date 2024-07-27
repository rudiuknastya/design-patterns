package command;

public class Move implements Command{
    private Shape shape;
    private int x;
    private int y;
    private int z;


    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setXYZ(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public void execute() {
        shape.move(x,y,z);
    }
}
