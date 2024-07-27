package state;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.setState(new WaitingState());
        printer.nextState();
        printer.nextState();
        printer.nextState();
    }
}
