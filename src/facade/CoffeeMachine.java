package facade;

public class CoffeeMachine {
    private String water = "Water";
    private String coffee = "Coffee";
    private СoffeeGrinder grinder = new СoffeeGrinder();
    private Heater heater = new Heater();
    private СoffeeMaker coffeeMaker = new СoffeeMaker();
    public void makeCoffee(){
        String heatedWater = heater.heat(water);
        String grindedCoffee = grinder.grind(coffee);
        System.out.println(grindedCoffee);
        System.out.println(coffeeMaker.makeCoffee(grindedCoffee, heatedWater));
    }

}
