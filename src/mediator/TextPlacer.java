package mediator;

public class TextPlacer implements Mediator{
    private InputForm inputForm;
    private Textfield textfield;

    public TextPlacer(InputForm inputForm, Textfield textfield) {
        this.inputForm = inputForm;
        this.textfield = textfield;
    }

    @Override
    public void placeText() {
        textfield.setText(inputForm.getText());
        textfield.showText();
    }
}
