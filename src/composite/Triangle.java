package composite;

public class Triangle implements Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void scale(int coef) {
        System.out.println("Now triangle with sides " + a*coef +" "+b*coef+" "+c*coef);
    }
}
