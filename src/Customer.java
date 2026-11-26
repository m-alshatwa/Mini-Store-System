public class Customer extends User{
    private double walletBalance;
    private static int nextId = 1000;

    Electronics elc[] = new Electronics[5];
    int elcCounter = 0;
    Clothing clot[] = new Clothing[5];
    int cloCounter = 0;


    public Customer(String name, double walletBalance){
        super(nextId++,name);
        this.walletBalance = walletBalance;
    }
    public Customer(){
        this("Unknown",0);
    }

    void addFunds(double funds){
        this.walletBalance += funds;
    }

    public static void TotalUser(){
        System.out.println(nextId-1000);
    }

    void addToCart(Electronics ele){
        if (elcCounter < elc.length ){
            elc[elcCounter++] = ele;
        }
    }

    void addToCart(Clothing clo){
        if (cloCounter < clot.length ){
            clot[cloCounter++] = clo;
        }
    }

    void printCarts(){
        System.out.println("    Electronics Cart:");
        if (elcCounter == 0){
            System.out.println("    (Empty)");
        } else {
            for (int i = 0; i < elcCounter; i++) {
                System.out.println("    " + elc[i].getName() + " (" + elc[i].getPrice() + " SAR)");
            }
        }

        System.out.println("    Clothing Cart:");
        if (cloCounter == 0){
            System.out.println("    (Empty)");
        } else {
            for (int i = 0; i < cloCounter; i++) {
                System.out.println("    " + clot[i].getName() + " (" + clot[i].getPrice() + " SAR)");
            }
        }
    }

    public double getWalletBalance() {
        return walletBalance;
    }
}
