package chainOfResponsibility;

public abstract class Employee {
    protected Employee nextEmployee;

    public Employee(Employee nextEmployee) {
        this.nextEmployee = nextEmployee;
    }

    public Employee() {

    }

    public abstract void approve(Deal deal);
}
