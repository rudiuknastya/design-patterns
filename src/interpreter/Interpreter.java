package interpreter;

public class Interpreter {
    private Expression expression;
    public int interpret(String str, int[] array){
        if(str.toLowerCase().contains("min")){
            expression = new FindMinExpression(array);
        } else if (str.toLowerCase().contains("max")){
            expression = new FindMaxExpression(array);
        }
        return expression.interpret();
    }
}
