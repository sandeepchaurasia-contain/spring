package spring;

public class Emp {

    private String name;
    private int id;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor called");
    }

    public void show() {
        System.out.println("Emp id : " + id);
        System.out.println("Emp name : " + name);
    }
}
