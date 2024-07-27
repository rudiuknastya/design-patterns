package mediator;

public class App {
    public static void main(String[] args) {
        InputForm inputForm = new InputForm();
        Textfield textfield = new Textfield();
        inputForm.setText("Hello");
        Mediator mediator = new TextPlacer(inputForm,textfield);
        Button button = new Button(mediator);
        button.click();
        inputForm.setText("Bye");
        button.click();
    }
}
