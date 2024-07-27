package chainOfResponsibility;

public class Director extends Employee{
    @Override
    public void approve(Deal deal) {
        if (deal.getClient()%2 ==0) {
            System.out.println("Deal approved by director");
        }
        else {
            System.out.println("Deal not approved by director");
        }
    }
}
