package builder;

public class UsualCakeBuilder implements Builder{
    private Cake usualCake;
    public void initializeCake(){
        usualCake = new Cake();
    }
    public void setCream(){
        usualCake.setCream("Butter cream");
    }
    public void setCakeType(){
        usualCake.setCakeType("Chocolate cakes");
    }
    public void setFilling(){
        usualCake.setFilling("Strawberry filling");
    }
    public Cake returnCake(){
        return usualCake;
    }
}
