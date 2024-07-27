package abstractFactory;

import java.util.Scanner;

public class Application {

    private static ToyFactory factory;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Pl for plastic or Ps for plush");
        String type = sc.nextLine();  // Read user input

        if(type.equals("Pl")){
            factory = new PlacticFactory();
            RabbitToy rabbit= factory.createRabbitToy();
            DogToy dog = factory.createDogToy();
            rabbit.play();
            dog.play();
        }
        if(type.equals("Ps")){
            factory = new FabricFactory();
            RabbitToy rabbit= factory.createRabbitToy();
            DogToy dog = factory.createDogToy();
            rabbit.play();
            dog.play();
        }

    }
}
