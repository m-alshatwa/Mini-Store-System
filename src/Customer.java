public class Customer extends User{
    private double walletBalance;
    private ShoppingCart shoppingCart;




    public Customer(String name, double walletBalance){
        super(name);
        this.walletBalance = walletBalance;
        shoppingCart = new ShoppingCart(10);
    }
    public Customer(){
        this("Unknown",0);
    }

    void addFunds(double funds){
        if (funds <= 0 ){
            System.out.println("Deposit must be positive.");
            return;
        }
        this.walletBalance += funds;
    }





    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void addToCart(Product product){
        shoppingCart.addProduct(product);
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}
