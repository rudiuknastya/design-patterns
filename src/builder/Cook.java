package builder;

public class Cook {
    private Builder builder;
    public Cook(Builder builder){
        this.builder = builder;
    }
    public void createCake(){
        builder.initializeCake();
        builder.setCream();
        builder.setCakeType();
        builder.setFilling();
    }
}
