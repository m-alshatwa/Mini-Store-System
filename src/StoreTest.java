public class StoreTest {
    public static void main(String[] args) {
        Customer cts[] = {
                new Customer("Khalid", 1500),
                new Customer("Sara", 2000)
        };

        cts[0].addToCart(new Electronics(1, "Desk Fan", 120, 10, 12));
        cts[0].addToCart(new Clothing(2, "Cotton T-Shirt", 85, 12, "M", "cotton"));

        cts[1].addToCart(new Electronics(1, "Smartphone", 3500, 10, 12));
        cts[1].addToCart(new Electronics(1, "Headphones", 350, 10, 12));

        System.out.println("--- CUSTOMER ROSTER & CARTS ---");
        for (int i = 0; i < cts.length; i++){
            System.out.println("Customer: " + cts[i].getName() + " (ID: " + cts[i].getId() + ") | Balance: " + cts[i].getWalletBalance() +" SAR");
            cts[i].printCarts();
        }


    }
}
