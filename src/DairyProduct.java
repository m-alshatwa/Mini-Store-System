public class DairyProduct extends Grocery{
    private String expirationDate;
    private boolean requiresRefrigeration;

    public DairyProduct(String name, double price, int stockQuantity, double weightInKilos, String expirationDate, boolean requiresRefrigeration){
        super(name, price, stockQuantity, weightInKilos);
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    void checkRefrigeration(){
        if(requiresRefrigeration){
            System.out.println("need refrigeration");
        }
    }
}
