public class Electronics extends Product{
    private int warrantyMonths;

    public Electronics(String name, double price, int stockQuantity, int warrantyMonths){
        super(name, price, stockQuantity);
        this.warrantyMonths = warrantyMonths;
    }

    public Electronics(){
        this("Unknown", 0, 0,0);
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    void applyDiscount(double percentage){
        if (percentage < 0 || percentage > 100){
            System.out.println("Discount must be between 0 and 100.");
            return;
        }
        setPrice(getPrice() - getPrice() * (percentage/100));
    }


}
