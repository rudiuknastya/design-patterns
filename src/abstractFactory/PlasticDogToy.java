package abstractFactory;

public class PlasticDogToy extends DogToy{
    private String material;
    private String plasticQuality;
    public PlasticDogToy(String material, String plasticQuality, int size){
        super(size);
        this.material = material;
        this.plasticQuality = plasticQuality;
    }
    @Override
    public void play() {
        System.out.println("You play with "+material + " dog");
    }
}
