public class FresTomato extends ToppingDecorator {
    private Pizza pizza;

    public FresTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" "+ "FreshTomato";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+ 4000;
    }
}
