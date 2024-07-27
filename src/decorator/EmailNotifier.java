package decorator;

public class EmailNotifier extends Notifier{
    private String emailAdress;

    public EmailNotifier(String message, String emailAdress) {
        super(message);
        this.emailAdress = emailAdress;
    }

    @Override
    public void notifys() {
        System.out.println("Send "+ "'"+message+"'"+" to email "+ emailAdress);
    }
}
