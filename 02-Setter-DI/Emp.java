package spring;

public class Emp {

    private String name;

    public Emp() {
        System.out.println("Emp object created");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Setter called : setName()");
    }

    public void show() {
        System.out.println("Emp name is : " + name);
    }
}
