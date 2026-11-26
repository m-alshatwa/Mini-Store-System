public class Electronics {
    int productId;
    String name;
    double price;
    int stockQuantity;
    int warrantyMonths;

    public Electronics(int productId, String name, double price, int stockQuantity, int warrantyMonths){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity =stockQuantity;
        this.warrantyMonths = warrantyMonths;
    }

    public Electronics(){
        this(0, "Unknown", 0, 0,0);
    }

    void applyDiscount(double percentage){
        price -= price * (percentage/100);
    }
}
