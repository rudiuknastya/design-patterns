package mediator;

public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }
    public void click(){
        mediator.placeText();
    }

}
