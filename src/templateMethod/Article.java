package templateMethod;

public abstract class Article {
    public void writeArticle(){
        writeTitle();
        writeIntroduction();
        writeMainPart();
        writeConclusion();
        writeReference();
    }
    private void writeTitle(){
        System.out.println("Usual title");
    }
    private void writeIntroduction(){
        System.out.println("Usual introduction");
    }
    protected abstract void  writeMainPart();
    private void writeConclusion(){
        System.out.println("Usual conclusion");
    }
    protected abstract void writeReference();

}
