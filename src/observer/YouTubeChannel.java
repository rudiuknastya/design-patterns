package observer;

public class YouTubeChannel {
    private String video;
    private String channelName;
    private Notifier notifier = new Notifier();

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void subscribeNotifications(Subscriber subscriber) {
        notifier.subscribe(subscriber);
    }

    public void unsubscribeNotifications(Subscriber subscriber) {
        notifier.unsubscribe(subscriber);
    }
    public void addVideo(String video) {
        this.video = video;
    }
    public void notifySubscribers(){
        notifier.notifys(channelName, video);
    }
}
