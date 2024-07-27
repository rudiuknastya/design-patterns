package builder;

public class VeganCakeBuilder implements Builder{

    private Cake veganCake;
    public void initializeCake(){
        veganCake = new Cake();
    }
    public void setCream(){
        veganCake.setCream("Vegan cream");
    }
    public void setCakeType(){
        veganCake.setCakeType("Vegan cakes");
    }
    public void setFilling(){
        veganCake.setFilling("Rasberry filling");
    }
    public Cake returnCake(){
        return veganCake;
    }
}
