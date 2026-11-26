public class Clothing extends Product{
    private String size;
    private String fabricType;

    public Clothing(String name, double price, int stockQuantity, String size, String fabricType){
        super(name, price, stockQuantity);
        this.size = size;
        this.fabricType = fabricType;
    }

    public String getSize() {
        return size;
    }

    boolean isSizeAvailable(String size){
        return this.size.equals(size);
    }
}
