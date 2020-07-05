public class Barbeque extends ToppingDecorator {
    public Pizza pizza ;
    public Barbeque(Pizza pizza)
    {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" "+"Barbeque";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+500;
    }
}
