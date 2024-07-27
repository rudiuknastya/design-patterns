package memento;

public class Memento {
    private String text;
    private String font;
    private int textSize;

    public Memento(String text, String font, int textSize) {
        this.text = text;
        this.font = font;
        this.textSize = textSize;
    }

    public String getText() {
        return text;
    }

    public String getFont() {
        return font;
    }

    public int getTextSize() {
        return textSize;
    }
}
