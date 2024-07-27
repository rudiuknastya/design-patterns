package strategy;

public class App {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(2,5,3);
        SolveStrategy vietaStrategy = new VietaTheorem();
        equation.setStrategy(vietaStrategy);
        equation.solve();
        SolveStrategy discriminantStrategy = new Discriminant();
        equation.setStrategy(discriminantStrategy);
        equation.solve();
    }
}
