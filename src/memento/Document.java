package memento;

public class Document {
    private String text;
    private String font = "Time New Roman";
    private int textSize = 14;

    public void setText(String text) {
        this.text = text;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public void setTextSize(int textSize) {
        this.textSize = textSize;
    }

    public void showText(){
        System.out.println("Text: "+text+" in font "+font+" in "+ textSize+" size");
    }
    public Memento save(){
        return new Memento(text, font, textSize);
    }
    public void undo(Memento m){
        text = m.getText();
        font = m.getFont();
        textSize = m.getTextSize();
    }
}
