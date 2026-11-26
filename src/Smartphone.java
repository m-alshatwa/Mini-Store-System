public class Smartphone extends Electronics{
    private String operatingSystem;
    private int storageCapacity;

    public Smartphone(int productId, String name, double price, int stockQuantity, int warrantyMonths, String operatingSystem, int storageCapacity){
        super(productId, name, price, stockQuantity, warrantyMonths);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

}
