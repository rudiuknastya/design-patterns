package decorator;

public abstract class Notifier {
    protected String message;

    public Notifier(String message) {
        this.message = message;
    }
    public abstract void notifys();
}
