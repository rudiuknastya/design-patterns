package abstractFactory;

public abstract class RabbitToy {

    protected int size;

    public RabbitToy(int size) {
        this.size = size;
    }
    public abstract void play();
}
