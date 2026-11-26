public class Grocery extends Product{
    private double weightInKilos;

    public Grocery(int productId, String name, double price, int stockQuantity, double weightInKilos){
        super(productId, name, price, stockQuantity);
        this.weightInKilos = weightInKilos;
    }

    public Grocery(){
        this(0, "unknown", 0, 0, 0);
    }

    void saleByWeight(double weightInKilos){
        if(weightInKilos <= this.weightInKilos){
            this.weightInKilos -= weightInKilos;
        }
    }
}
