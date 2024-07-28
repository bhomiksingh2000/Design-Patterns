public class Main {
    public static void main(String[] args) {

       BasePizza basePizza;

//       ToppingDecorator extraCheese = new ExtraCheese(new VegDelight());
//       extraCheese.cost();
//
//        ToppingDecorator extraVeggies = new ExtraVeggies(new VegDelight());
//        extraVeggies.cost();

        // now adding all toppings at once
        ToppingDecorator megaPizza = new ExtraCheese (new ExtraVeggies(new ExtraVeggies(new VegDelight())));
        megaPizza.cost();

        // point to note here is that you can only take one Base PIZZAAAA
    }
}