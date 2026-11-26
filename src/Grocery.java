public class Grocery extends Product{
    private double weightInKilos;

    public Grocery(String name, double price, int stockQuantity, double weightInKilos){
        super(name, price, stockQuantity);
        this.weightInKilos = weightInKilos;
    }

    public Grocery(){
        this("unknown", 0, 0, 0);
    }

    public double getWeightInKilos() {
        return weightInKilos;
    }
}
