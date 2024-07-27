package observer;

public class App {
    public static void main(String[] args) {
        YouTubeChannel channel1 = new YouTubeChannel("Crazy DIY");
        YouTubeChannel channel2 = new YouTubeChannel("Java Teacher");
        Subscriber subscriber1 = new Subscriber("Nastya");
        channel1.subscribeNotifications(subscriber1);
        channel2.subscribeNotifications(subscriber1);
        Subscriber subscriber2 = new Subscriber("Oleg");
        channel1.subscribeNotifications(subscriber2);
        channel1.addVideo("New DIY");
        channel1.notifySubscribers();
        channel2.addVideo("Observer pattern");
        channel2.notifySubscribers();
        channel1.unsubscribeNotifications(subscriber1);
        channel1.addVideo("DIY How not to sleep during exam week and don't die");
        channel1.notifySubscribers();

    }
}
