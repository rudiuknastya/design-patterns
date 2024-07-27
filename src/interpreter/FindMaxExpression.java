package interpreter;

public class FindMaxExpression implements Expression{
    private int[] array;
    private int max;
    public FindMaxExpression(int[] array) {
        this.array = array;
    }

    @Override
    public int interpret() {
        max = array[0];
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
