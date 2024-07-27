package visitor;

public class Child extends Patient{
    public Child(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVaccinated(Visitor visitor) {
        visitor.vaccinateChild(this);
    }
}
