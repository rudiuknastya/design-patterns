package templateMethod;

public class AcademicArticle extends Article{
    @Override
    protected void writeMainPart() {
        System.out.println("Academic style main part");
    }

    @Override
    protected void writeReference() {
        System.out.println("Academic style references");
    }
}
