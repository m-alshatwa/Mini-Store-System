public class Electronics extends Product{
    private int warrantyMonths;

    public Electronics(int productId, String name, double price, int stockQuantity, int warrantyMonths){
        super(productId, name, price, stockQuantity);
        this.warrantyMonths = warrantyMonths;
    }

    public Electronics(){
        this(0, "Unknown", 0, 0,0);
    }

//    void applyDiscount(double percentage){
//        price -= price * (percentage/100);
//    }


}
