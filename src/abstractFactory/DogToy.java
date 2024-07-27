package abstractFactory;

public abstract class DogToy {

    protected int size;

    public DogToy(int size) {
        this.size = size;
    }

    public abstract void play();
}
