package visitor;

public class Doctor implements Visitor{
    @Override
    public void vaccinateChild(Child child) {
        System.out.println(child.getName()+" vaccinate with child vaccine");
    }

    @Override
    public void vaccinateAdult(Adult adult) {
        System.out.println(adult.getName()+ " vaccinate with adult vaccine");
    }
}
