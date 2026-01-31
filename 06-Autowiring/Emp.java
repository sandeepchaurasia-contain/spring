package spring;

public class Emp {

    private Address address;

    public Emp() {
        System.out.println("Emp object created");
    }

    public void setAddress(Address address) {
        this.address = address;
        System.out.println("setAddress() called");
    }

    public void show() {
        address.show();
    }
}
