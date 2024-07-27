package builder;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter U for usual cake or V for vegan");
        String cakeType = sc.nextLine();
        Cook cook = null;
        if(cakeType.equals("U")){
            UsualCakeBuilder builder = new UsualCakeBuilder();
            cook = new Cook(builder);
            cook.createCake();
            Cake cake = builder.returnCake();
            cake.getCake();
        }
        if(cakeType.equals("V")){
            VeganCakeBuilder builder = new VeganCakeBuilder();
            cook = new Cook(builder);
            cook.createCake();
            Cake cake = builder.returnCake();
            cake.getCake();
        }

    }
}
