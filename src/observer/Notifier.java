package observer;

import java.util.ArrayList;
import java.util.List;

public class Notifier {
    private List<Subscriber> subscribers = new ArrayList<>();
    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
        System.out.println("User "+ subscriber.getUserName() +" subscribed notifications");
    }
    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
        System.out.println("User "+ subscriber.getUserName() +" unsubscribed notifications");
    }
    public void notifys(String channelName, String video){
        for(Subscriber subscriber: subscribers){
            subscriber.getNotify(channelName, video);
        }
    }
}
