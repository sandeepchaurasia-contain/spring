package spring;

public class Emp {

    private String name;

    public Emp(String name) {
        this.name = name;
        System.out.println("Emp Constructor : name = " + name);
    }

    public void init() {
        System.out.println("Bean is initialized with name : " + name);
    }

    public void destroy() {
        System.out.println("Bean will be destroyed");
    }
}
