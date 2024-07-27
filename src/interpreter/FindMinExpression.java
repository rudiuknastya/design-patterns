package interpreter;

public class FindMinExpression implements Expression{
    private int[] array;
    private int min;
    public FindMinExpression(int[] array) {
        this.array = array;
    }
    @Override
    public int interpret() {
        min = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
