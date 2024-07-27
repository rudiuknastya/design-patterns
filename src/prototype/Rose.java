package prototype;

public class Rose extends Flower {
    private int thornQuantity;
    public Rose(int height, String color, int timeToLive, int thornQuantity) {
        super(height, color, timeToLive);
        this.thornQuantity = thornQuantity;
    }
    public Rose(Flower flower) {
        super(flower);
    }
    @Override
    public void printFlower() {
        System.out.println("Height: " + height+ "cm Color: "+color+" Time to live: "+ timeToLive+"month Thorn quantity: "+thornQuantity);
    }

    @Override
    public Flower clone() {
        return new Rose(this);
    }
}
