public class Product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;

    Product(int productId, String name, double price, int stockQuantity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
