public class BusinessCustomerRepresentative extends User{
    private String companyName;
    private String taxId;
    private double creditLimit;

    public BusinessCustomerRepresentative(String name, String companyName, String taxId, double creditLimit){
        super(name);
        this.companyName = companyName;
        this.taxId = taxId;
        this.creditLimit = creditLimit;
    }

    void requestCreditIncrease(double amount){
        if (amount <= 0 ){
            System.out.println("Requested increase must be positive.");
            return;
        }
        creditLimit += amount;
    }


}
