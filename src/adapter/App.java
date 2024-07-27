package adapter;

public class App {
    public static void main(String[] args) {
        Skirt skirt = new Skirt(32);
        TShirt tShirt = new TShirt(38);
        SizeAdapter sizeAdapter = new SizeAdapter();
        sizeAdapter.setCloth(skirt);
        System.out.println("UK skirt size: "+sizeAdapter.getSize());
        sizeAdapter.setCloth(tShirt);
        System.out.println("UK T-Shirt size: "+sizeAdapter.getSize());
    }
}
