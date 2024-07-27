package proxy;

public class RealServer implements Server{
    @Override
    public void setData(Data data) {
        System.out.println("Added data: "+ data.getName()+" "+data.getSurname()+" "+data.getPhoneNumber());
    }
}
