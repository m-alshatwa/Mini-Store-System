public class DairyProduct {
    int productId;
    String name;
    double price;
    int stockQuantity;
    double weightInKilos;
    String expirationDate;
    boolean requiresRefrigeration;

    public DairyProduct(int productId, String name, double price, int stockQuantity, double weightInKilos, String expirationDate, boolean requiresRefrigeration){
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity =stockQuantity;
        this.weightInKilos = weightInKilos;
        this.expirationDate = expirationDate;
        this.requiresRefrigeration = requiresRefrigeration;
    }

    void needRefrigeration(){
        if(requiresRefrigeration){
            System.out.println("need refrigeration");
        }
    }
}
