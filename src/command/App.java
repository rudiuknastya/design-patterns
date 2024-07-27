package command;

public class App {
    public static void main(String[] args) {
        Shape cube = new Cube(20);
        Shape sphere = new Sphere(17);
        Move move = new Move();
        Rotate rotate = new Rotate();
        move.setShape(cube);
        move.setXYZ(2,5,0);
        move.execute();
        move.setShape(sphere);
        move.setXYZ(0,5,0);
        move.execute();
        rotate.setShape(cube);
        rotate.setAngle(10);
        rotate.execute();
    }
}
