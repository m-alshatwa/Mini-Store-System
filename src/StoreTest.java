public class StoreTest {
    public static void main(String[] args) {
        Inventory inv = new Inventory(20);

        Electronics ele = new Electronics("Desk Fan", 120, 10, 12);
        Smartphone sm = new Smartphone("Galaxy S24", 3500, 10, 12, "Android", 256 );
        Clothing clo = new Clothing("Cotton T-Shirt", 85, 12, "M", "cotton");
        Grocery gr = new Grocery("Rice Bag", 45, 60, 10);
        DairyProduct dp = new DairyProduct("Fresh Milk", 8, 30, 1, "2026-12-20", true);

        inv.addProduct(ele);
        inv.addProduct(sm);
        inv.addProduct(clo);
        inv.addProduct(gr);
        inv.addProduct(dp);


        Customer cts[] = {
                new Customer("Khalid", 1500),
                new Customer("Sara", 2000),
                new Customer("Omar", 300)
        };

        cts[0].addToCart(ele);
        cts[0].addToCart(clo);

        cts[1].addToCart(sm);
        cts[1].addToCart(dp);
        cts[1].addToCart(gr);

        System.out.println("--- QUICKCART CATALOG ---");
        inv.printCatalog();

        System.out.println("");

        System.out.println("--- CUSTOMER ROSTER & CARTS ---");
        for (int i = 0; i < cts.length; i++){
            System.out.println("Customer: " + cts[i].getName() + " (ID: " + cts[i].getId() + ") | Balance: " + cts[i].getWalletBalance() +" SAR");
            cts[i].getShoppingCart().printCart();
        }

        System.out.println("");
        System.out.println("--- CASTING CHECK ---");
        Product pro = inv.findById(5001);
        if(pro instanceof Electronics){
            Electronics e = ((Electronics) pro);
            e.applyDiscount(10);
            System.out.println("Found: " + e.getName());
            System.out.println("After 10% discount: " + e.getPrice() + " SAR");
            System.out.println("Total users created: " + User.getTotalUsers());
            System.out.println("Total products created: " + Product.getTotalProducts());

        }


    }
}
