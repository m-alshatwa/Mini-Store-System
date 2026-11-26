public class ShoppingCart {
    private Product[] items;
    private int itemCount = 0;

    ShoppingCart(int capacity){
        items = new Product[capacity];
    }

    boolean addProduct(Product product){
        if (itemCount == items.length){
            System.out.println("Cart is full. Cannot add " + product.getName() + ".");
            return false;
        }
        items[itemCount++] = product;
        return true;
    }

    public int getItemCount() {
        return itemCount;
    }

    boolean isEmpty(){
        if (itemCount == 0)
            return true;
        return false;
    }

    double calculateSubtotal(){
        double total = 0;
        for (int i=0; i < itemCount; i++){
            total += items[i].getPrice();
        }
        return total;
    }

    void printCart(){
        if(isEmpty()){
            System.out.println("    (Empty)");
            return;
        }
        for (int i=0; i < itemCount; i++){
            Product pro = items[i];
            if(pro instanceof Smartphone){
                Smartphone sm = (Smartphone)pro;
                System.out.println("    [Smartphone] " + sm.getName() + " | " + sm.getPrice() + " SAR | OS: " + sm.getOperatingSystem() + " | Storage: "+ sm.getStorageCapacity() + "GB");
            } else if(pro instanceof Electronics){
                Electronics ele = (Electronics) pro;
                System.out.println("    [Electronics] " + ele.getName() + " | " + ele.getPrice() + " SAR | Warranty: " + ele.getWarrantyMonths() + " months");
            } else if(pro instanceof DairyProduct){
                DairyProduct dp = (DairyProduct) pro;
                System.out.println("    [Dairy] " + dp.getName() + " | " + dp.getPrice() + " SAR | Exp: " + dp.getExpirationDate());
            } else if(pro instanceof Grocery){
                Grocery gr = (Grocery) pro;
                System.out.println("    [Grocery] " + gr.getName() + " | " + gr.getPrice() + " SAR | Weight: " + gr.getWeightInKilos() + " kg");
            } else if (pro instanceof Clothing){
                Clothing clo = (Clothing) pro;
                System.out.println("    [Clothing] " + clo.getName() + " | " + clo.getPrice() + " SAR | Size: " + clo.getSize());
            }
        }
    }
}
