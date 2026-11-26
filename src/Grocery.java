public class Grocery extends Product{
    double weightInKilos;

    public Grocery(int productId, String name, double price, int stockQuantity, double weightInKilos){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity =stockQuantity;
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
