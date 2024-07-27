package builder;

public class Cake {
    private String cream;
    private String cakeType;
    private String filling;

    public void setCream(String newCream){
        cream = newCream;
    }
    public void setCakeType(String newCakeType){
        cakeType = newCakeType;
    }
    public void setFilling(String newFilling){
        filling = newFilling;
    }
    public void getCake(){
        System.out.println("Your cake with "+ cream+" "+cakeType+" "+ filling+ " ");
    }
}
