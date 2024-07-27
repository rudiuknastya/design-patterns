package flyweight;

public class Stone {
    private int x;
    private int y;
    StoneStyle stoneStyle;

    public Stone(int x, int y, StoneStyle stoneStyle) {
        this.x = x;
        this.y = y;
        this.stoneStyle = stoneStyle;
    }

    public void getStone(){
        stoneStyle.getStone(x,y);
    }

}
