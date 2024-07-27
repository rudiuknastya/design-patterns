package abstractFactory;

public class PlacticFactory implements ToyFactory {
    @Override
    public RabbitToy createRabbitToy(){
        return new PlasticRabbitToy("plastic","high", 14);
    }
    @Override
    public DogToy createDogToy() {
        return new PlasticDogToy("plastic", "low", 50);
    }
}
