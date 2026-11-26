public class Product {
    private int productId;
    private String name;
    private double price;
    private int stockQuantity;
    private static int nextProductId = 5000;

    Product(String name, double price, int stockQuantity){
        this.productId = nextProductId++;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0 ){
            System.out.println("Price cannot be negative.");
            return;
        }
        this.price = price;
    }

    public int getStockQuantity() {
        return stockQuantity;
    }

    public static int getTotalProducts(){
        return nextProductId-5000;
    }
}
