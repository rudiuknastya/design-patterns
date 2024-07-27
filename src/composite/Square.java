package composite;

public class Square implements Shape{
   private int sideLength;

    public Square(int sideLength) {
        this.sideLength = sideLength;
    }
    @Override
    public void scale(int coef) {
        System.out.println("Now square with side length " + sideLength*coef);
    }
}
