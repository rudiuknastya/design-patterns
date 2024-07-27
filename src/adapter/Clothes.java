package adapter;

public abstract class Clothes {
    protected int size;
    public Clothes(int size) {
        this.size = size;
    }
    public Clothes(){};

    public abstract int getSize();
}
