package flyweight;

public class StoneStyle {
    private String size;
    private String color = "grey";


    public StoneStyle(String size) {
        this.size = size;
    }
    public void getStone(int x, int y){
        System.out.println(color +" stone " + size+ " size lays in coordinate "+ x+" "+y);
    }
}
