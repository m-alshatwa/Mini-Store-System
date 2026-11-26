public class Smartphone {
    int productId;
    String name;
    double price;
    int stockQuantity;
    int warrantyMonths;
    String operatingSystem;
    int storageCapacity;

    public Smartphone(int productId, String name, double price, int stockQuantity, int warrantyMonths, String operatingSystem, int storageCapacity){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity =stockQuantity;
        this.warrantyMonths = warrantyMonths;
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

    void applyDiscount(double percentage){
        price -= price * (percentage/100);
    }
}
