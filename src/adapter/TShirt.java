package adapter;

public class TShirt extends Clothes {
    private int size;

    public TShirt(int size){
         super(size);
    }
    @Override
    public int getSize() {
        return size;
    }
}
