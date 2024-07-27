package abstractFactory;

public class FabricFactory implements ToyFactory {
    @Override
    public RabbitToy createRabbitToy() {
        return new FabricRabbitToy("plush",40, 20);
    }
    @Override
    public DogToy createDogToy() {
        return new FabricDogToy("polyester", 50, 90);
    }

}
