public class Paneer extends ToppingDecorator {
    private Pizza pizza;

    public Paneer(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" "+ "Paneer";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+3000;
    }
}
