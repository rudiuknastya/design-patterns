package prototype;

public class Tulip extends Flower{

    public Tulip(int height, String color, int timeToLive) {
        super(height, color, timeToLive);
    }
    public Tulip(Flower flower) {
        super(flower);
    }

    @Override
    public void printFlower() {
        System.out.println("Height: " + height+ "cm Color: "+color+" Time to live: "+ timeToLive+" month");
    }

    @Override
    public Flower clone() {
        return new Tulip(this);
    }
}
