package proxy;

public class App {
    public static void main(String[] args) {
        Server server = new ProxyServer();
        Data data = new Data("Nastya","Rudiuk","+350958721563");
        server.setData(data);
        data.setPhoneNumber("+380958721563");
        server.setData(data);
    }
}
