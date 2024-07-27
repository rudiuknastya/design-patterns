package prototype;

public class Application {
    public static void main(String[] args) {
        Rose rose = new Rose(50,"Red", 2, 15);
        Tulip tulip = new Tulip(15,"Pink",1);
        Flower flower1 = rose.clone();
        flower1.printFlower();
        Flower flower2 = tulip.clone();
        flower2.printFlower();
    }
}
