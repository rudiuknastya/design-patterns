package state;

public class PrintingState implements State{
    public PrintingState() {
        System.out.println("Printer is printing");
    }

    @Override
    public void next(Printer printer) {
        printer.setState(new FinishState());

    }
}
