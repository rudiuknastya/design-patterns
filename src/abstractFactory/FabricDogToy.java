package abstractFactory;

public class FabricDogToy extends DogToy{
    private String fabric;
    private int fabricQuantity;
    public FabricDogToy(String fabric, int fabricQuantity, int size){
        super(size);
        this.fabric = fabric;
        this.fabricQuantity = fabricQuantity;
    }
    @Override
    public void play() {
        System.out.println("You play with "+fabric + " dog");
    }
}
