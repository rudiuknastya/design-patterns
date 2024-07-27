package builder;

public interface Builder {
    public void initializeCake();
    public void setCream();
    public void setCakeType();
    public void setFilling();
    public Cake returnCake();
}
