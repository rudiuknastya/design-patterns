package abstractFactory;

public class FabricRabbitToy extends RabbitToy{
    private String fabric;
    private int fabricQuantity;
    public FabricRabbitToy(String fabric, int fabricQuantity, int size){
        super(size);
        this.fabric = fabric;
        this.fabricQuantity = fabricQuantity;
    }
    @Override
    public void play() {
        System.out.println("You play with "+fabric + " rabbit");
    }
}
