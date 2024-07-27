package chainOfResponsibility;

public class UsualEmployee extends Employee{
    public UsualEmployee(Employee nextEmployee) {
        super(nextEmployee);
    }
    @Override
    public void approve(Deal deal) {
        if (deal.getPrice() < 10000) {
            System.out.println("Deal approved by usual employee");
        }
        else if(nextEmployee != null){
                nextEmployee.approve(deal);
        }
    }
}
