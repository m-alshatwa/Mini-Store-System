public class User {
    private int id;
    private String name;
    private static int nextId = 1000;

    User(String name){
        this.id = nextId++;
        this.name = name;
    }

    public static int getTotalUsers(){
        return nextId-1000;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
