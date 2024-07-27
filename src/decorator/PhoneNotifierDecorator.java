package decorator;

public class PhoneNotifierDecorator extends Notifier{
    private Notifier notifier;
    private String phoneNumber;

    public PhoneNotifierDecorator(Notifier notifier, String phoneNumber, String message) {
        super(message);
        this.notifier = notifier;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notifys() {
        notifier.notifys();
        System.out.println("Send "+"'"+message+"'" +" to phone number "+ phoneNumber);
    }
}
