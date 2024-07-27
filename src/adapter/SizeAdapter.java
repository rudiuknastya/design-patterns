package adapter;

public class SizeAdapter extends Clothes {
    private Clothes cloth;
    public void setCloth (Clothes cloth){
        this.cloth = cloth;
    }

    @Override
    public int getSize() {
        if(cloth.getSize() == 32){
            return 4;
        } else if(cloth.getSize() == 34){
            return 6;
        }else if(cloth.getSize() == 36){
            return 8;
        }else if(cloth.getSize() == 38){
            return 10;
        } else {
            return 0;
        }

    }
}
