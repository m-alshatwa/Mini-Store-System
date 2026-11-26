public class Employee extends User{
    private double salary;

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    double calculateBonus(double percentage){
        return salary * (percentage / 100);
    }


}
