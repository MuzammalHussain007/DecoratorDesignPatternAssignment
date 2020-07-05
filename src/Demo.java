public class Demo {
    public static void main(String[] args) {
        Pizza chickenFiesta = new ChickenFiesta();
        chickenFiesta = new Barbeque(chickenFiesta);
        System.out.println(chickenFiesta.getDescription());
        System.out.println(chickenFiesta.getCost());
        System.out.println("----------------------------------------------------");
        Pizza margheritta = new Margheritta();
        margheritta= new Jaiapeno(margheritta);
        System.out.println(margheritta.getDescription());
        System.out.println(margheritta.getCost());
        System.out.println("----------------------------------------------------");
        Pizza farmHouse = new FarmHouse();
        farmHouse= new Paneer(farmHouse);
        System.out.println(farmHouse.getDescription());
        System.out.println(farmHouse.getCost());
        System.out.println("----------------------------------------------------");
        Pizza peppypaneer = new Peppypaneer();
        peppypaneer= new FresTomato(peppypaneer);
        System.out.println(peppypaneer.getDescription());
        System.out.println(peppypaneer.getCost());


    }
}
