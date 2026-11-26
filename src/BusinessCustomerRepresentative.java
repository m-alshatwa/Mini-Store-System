public class BusinessCustomerRepresentative {
    int id;
    String name;
    String companyName;
    String taxId;
    double creditLimit;
    private static int nextId = 5000;

    public BusinessCustomerRepresentative(String name, String companyName, String taxId, double creditLimit){
        this.id = nextId++;
        this.name = name;
        this.companyName = companyName;
        this.taxId = taxId;
        this.creditLimit = creditLimit;
    }

    void increaseCreditLimit(double amount){
        creditLimit += amount;
    }

    public static void TotalUser(){
        System.out.println(nextId-5000);
    }
}
