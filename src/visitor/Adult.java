package visitor;

public class Adult extends Patient {
    public Adult(String name, int age) {
        super(name, age);
    }

    @Override
    public void getVaccinated(Visitor visitor) {
        visitor.vaccinateAdult(this);
    }
}
