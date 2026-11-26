public class Grocery {
    int productId;
    String name;
    double price;
    int stockQuantity;
    double weightInKilos;

    public Grocery(int productId, String name, double price, int stockQuantity, double weightInKilos){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity =stockQuantity;
        this.weightInKilos = weightInKilos;
    }

    void saleByWeight(double weightInKilos){
        if(weightInKilos <= this.weightInKilos){
            this.weightInKilos -= weightInKilos;
        }
    }
}
