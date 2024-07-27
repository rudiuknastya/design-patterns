package state;

public class WaitingState implements State{
    public WaitingState() {
        System.out.println("Printer is waiting for document to print");
    }

    @Override
    public void next(Printer printer) {
        printer.setState(new PrintingState());
    }
}
