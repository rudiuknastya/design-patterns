package chainOfResponsibility;

public class Manager extends Employee{
    public Manager(Employee nextEmployee) {
        super(nextEmployee);
    }
    @Override
    public void approve(Deal deal) {
        if (deal.getPrice() < 50000) {
            System.out.println("Deal approved by manager");
        }
        else if(nextEmployee != null){
            nextEmployee.approve(deal);
        }
    }
}
