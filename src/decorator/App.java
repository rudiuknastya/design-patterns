package decorator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Notifier emailNotifier = new EmailNotifier("Your order approved", "nastia00@gmail.com");
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to have notification to your phone Y/N?");
        String agree = sc.nextLine();
        if(agree.equals("Y")){
            Notifier phoneAndEmail = new PhoneNotifierDecorator(emailNotifier, "+3801846572395", "Your order approved");
            phoneAndEmail.notifys();

        } else if (agree.equals("N")) {
            emailNotifier.notifys();

        }

    }
}
