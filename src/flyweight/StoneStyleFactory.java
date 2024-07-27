package flyweight;
import java.util.*;

public class StoneStyleFactory {
    static Map<String, StoneStyle> stoneStyles = new HashMap<>();
    public static StoneStyle getStyle(String size){
        StoneStyle stoneStyle = stoneStyles.get(size);
        if(stoneStyle == null){
            stoneStyle = new StoneStyle(size);
            stoneStyles.put(size, stoneStyle);
        }
        return stoneStyle;

    }
}
