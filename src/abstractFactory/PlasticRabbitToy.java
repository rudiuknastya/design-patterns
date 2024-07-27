package abstractFactory;

public class PlasticRabbitToy extends RabbitToy{
    private String material;
    private String plasticQuality;
    public PlasticRabbitToy(String material, String plasticQuality, int size){
        super(size);
        this.material = material;
        this.plasticQuality = plasticQuality;
    }
    @Override
    public void play() {
        System.out.println("You play with "+material + " rabbit");
    }
}
