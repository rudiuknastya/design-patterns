package state;

public class FinishState implements State{
    public FinishState() {
        System.out.println("Printer finish printing");
    }

    @Override
    public void next(Printer printer) {
        printer.setState(new WaitingState());
    }
}
