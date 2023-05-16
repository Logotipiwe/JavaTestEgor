package egor;

public class Employee extends Person {
    public Integer tax = 100;

    public void say() {
        System.out.println("HARD WORKING SUCK COCK!!!");
    }

    @Override
    public Integer getTax() {
        return tax;
    }
}
