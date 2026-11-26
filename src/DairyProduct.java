public class DairyProduct extends Grocery{
    private String expirationDate;
    private boolean requiresRefrigeration;

    public DairyProduct(int productId, String name, double price, int stockQuantity, double weightInKilos, String expirationDate, boolean requiresRefrigeration){
        super(productId, name, price, stockQuantity, weightInKilos);
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
    }

    void needRefrigeration(){
        if(requiresRefrigeration){
            System.out.println("need refrigeration");
        }
    }
}
