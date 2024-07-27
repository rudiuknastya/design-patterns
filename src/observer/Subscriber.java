package observer;

public class Subscriber {
    private String userName;

    public Subscriber(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }
    public void getNotify(String channelName, String video){
        System.out.println("User "+userName +" gets notification about new video "+"'" +video+"' from channel "+channelName);
    }
}
