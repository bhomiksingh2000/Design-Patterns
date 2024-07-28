public class ExtraVeggies extends ToppingDecorator{
    // here we will be adding toppings on the base pizza, therefore we
    // should be using a base pizza object , and

    BasePizza basePizza;

    public ExtraVeggies(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        int totalCost = basePizza.cost() + 40;
        System.out.println("base pizza Cost : " + basePizza.cost());
        System.out.println("base pizza Cost : " + totalCost);
        return totalCost;
    }
}
