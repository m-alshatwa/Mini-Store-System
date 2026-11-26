public class Smartphone extends Electronics{
    private String operatingSystem;
    private int storageCapacity;

    public Smartphone(String name, double price, int stockQuantity, int warrantyMonths, String operatingSystem, int storageCapacity){
        super(name, price, stockQuantity, warrantyMonths);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }
}
