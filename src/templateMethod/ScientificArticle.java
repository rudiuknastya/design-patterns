package templateMethod;

public class ScientificArticle extends Article{
    @Override
    protected void writeMainPart() {
        System.out.println("Scientific style main part");
    }

    @Override
    protected void writeReference() {
        System.out.println("Scientific style references");
    }
}
