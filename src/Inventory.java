public class Inventory {
    private Product[] products;
    int productCount;

    Inventory(int capacity){
        products = new Product[capacity];
    }

    void addProduct(Product product){
        if (productCount == products.length){
            System.out.println("Inventory is full.");
            return;
        }
        products[productCount++] = product;
    }

    public Product findById(int productId){
        for (int i=0; i <productCount; i++){
            if (products[i].getProductId() == productId){
                return products[i];
            }
        }
        return null;
    }

    public void printCatalog(){
        for (int i=0; i <productCount; i++){
            System.out.println("#" + products[i].getProductId() + " " + products[i].getName() + " | " + products[i].getPrice() + " SAR | Stock: " + products[i].getStockQuantity());
        }
    }
}
