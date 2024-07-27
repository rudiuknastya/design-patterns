package templateMethod;

public class Main {
    public static void main(String[] args) {
        Article academicArticle = new AcademicArticle();
        academicArticle.writeArticle();
        Article scientificArticle = new ScientificArticle();
        scientificArticle.writeArticle();

    }
}
