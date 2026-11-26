public class Clothing {
    int productId;
    String name;
    double price;
    int stockQuantity;
    String size;
    String fabricType;

    public Clothing(int productId, String name, double price, int stockQuantity, String size, String fabricType){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity =stockQuantity;
        this.size = size;
        this.fabricType = fabricType;
    }

    boolean isSizeAvailabel(String size){
        return this.size.equals(size);
    }
}
