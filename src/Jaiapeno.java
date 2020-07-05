public class Jaiapeno extends ToppingDecorator {
    private Pizza pizza ;
    public Jaiapeno(Pizza pizza)
    {
        this.pizza=pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" "+"Jaiapeno";
    }

    @Override
    public int getCost() {
        return pizza.getCost()+1000;
    }
}
