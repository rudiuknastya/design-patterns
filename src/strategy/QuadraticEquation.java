package strategy;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;
    private SolveStrategy strategy;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setStrategy(SolveStrategy strategy) {
        this.strategy = strategy;
    }
    public void solve(){
        strategy.solve(a,b,c);
    }
}
