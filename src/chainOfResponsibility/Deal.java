package chainOfResponsibility;

public class Deal {
    private int price;
    private String date;
    private int client;

    public Deal(int price, String date, int client) {
        this.price = price;
        this.date = date;
        this.client = client;
    }

    public int getPrice() {
        return price;
    }

    public int getClient() {
        return client;
    }
}
