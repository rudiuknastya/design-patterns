package chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Deal deal = new Deal(5000,"12.05.2025",3);
        Employee employee = new UsualEmployee(new Manager(new Director()));
        employee.approve(deal);
    }
}
