public class Employee extends User{
    double salary;
    private static int nextId = 2000;

    public Employee(String name, double salary){
        this.id = nextId++;
        this.name = name;
        this.salary = salary;
    }

    void printAnnualBouns(double percentage){
        System.out.println(salary * (percentage / 100));
    }

    public static void TotalUser(){
        System.out.println(nextId-2000);
    }

}
