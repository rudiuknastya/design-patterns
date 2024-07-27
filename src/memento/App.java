package memento;

public class App {
    public static void main(String[] args) {
        History history = new History();
        Document document = new Document();
        document.setText("hello");
        history.addMemento(document.save());
        System.out.println("Version 1: ");
        document.showText();
        document.setText("Hello");
        document.setFont("Arial");
        history.addMemento(document.save());
        System.out.println("Version 2: ");
        document.showText();
        document.setText("Bye");
        document.setTextSize(10);
        history.addMemento(document.save());
        System.out.println("Version 3: ");
        document.showText();
        document.undo(history.getMemento());
        System.out.println("Restore: ");
        document.showText();
        document.undo(history.getMemento());
        System.out.println("Restore: ");
        document.showText();
    }
}
