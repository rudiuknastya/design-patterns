package proxy;

public class ProxyServer implements Server{
    private RealServer server = new RealServer();
    @Override
    public void setData(Data data) {
        if(checkPhoneNumber(data.getPhoneNumber())){
            server.setData(data);
        } else{
            System.out.println("Please enter your phone number correctly");
        }
    }
    private boolean checkPhoneNumber(String number){
        String code = number.substring(0, 4);
        return code.equals("+380");
    }
}
