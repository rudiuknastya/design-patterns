package flyweight;

import java.util.ArrayList;
import java.util.List;

public class StoneField {
    private List<Stone> stones = new ArrayList<>();
    public void createStone(String size, int x, int y){
        StoneStyle style = StoneStyleFactory.getStyle(size);
        Stone stone = new Stone(x,y,style);
        stones.add(stone);
    }
    public void showStones(){
        for(Stone stone: stones){
            stone.getStone();
        }
    }
    public static void main(String[] args) {
        StoneField field = new StoneField();
        String size;
        for(int i = 0; i < 8; i++){
            if(i%2 ==0){
                size = "medium";
            } else{
                size = "small";
            }
            field.createStone(size,i,i+3);
        }
        field.showStones();

    }
}
