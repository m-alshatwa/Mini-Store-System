public class BusinessCustomerRepresentative extends User{
    private String companyName;
    private String taxId;
    private double creditLimit;
    private static int nextId = 5000;

    public BusinessCustomerRepresentative(String name, String companyName, String taxId, double creditLimit){
        super(nextId++, name);
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
