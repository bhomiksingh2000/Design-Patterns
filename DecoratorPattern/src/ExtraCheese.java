public class ExtraCheese extends ToppingDecorator{

    // here we will be adding toppings on the base pizza, therefore we
    // should be using a base pizza object , and

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int cost(){
        int totalCost = basePizza.cost() + 20;
        System.out.println("base pizza Cost : " + basePizza.cost());
        System.out.println("Cost : " + totalCost);
        return totalCost;
    }
}
