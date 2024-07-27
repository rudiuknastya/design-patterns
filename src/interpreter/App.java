package interpreter;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int array [] = new int[10];
        Random rand = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = rand.nextInt(60);
            System.out.print(array[i]+" ");
        }
        System.out.println();
        Interpreter interpreter = new Interpreter();
        System.out.println(interpreter.interpret("Find min in array", array));

    }
}
