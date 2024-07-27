package prototype;

public abstract class Flower {
    protected int height;
    protected String color;
    protected int timeToLive;

    public Flower (int height, String color, int timeToLive){
        this.height = height;
        this.color = color;
        this.timeToLive = timeToLive;
    }
    public Flower(Flower flower){
        this.height = flower.height;
        this.color = flower.color;
        this.timeToLive = flower.timeToLive;
    }

    public abstract void printFlower();
    public abstract Flower clone();
}
