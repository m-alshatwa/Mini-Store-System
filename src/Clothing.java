public class Clothing extends Product{
    private String size;
    private String fabricType;

    public Clothing(int productId, String name, double price, int stockQuantity, String size, String fabricType){
        super(productId, name, price, stockQuantity);
        this.size = size;
        this.fabricType = fabricType;
    }

    boolean isSizeAvailabel(String size){
        return this.size.equals(size);
    }
}
