package egor;

public class Student extends Person{

    private Integer tax = 10;
    @Override
    public void say() {
        System.out.println("I am gey im like BONCH");
    }

    @Override
    public Integer getTax() {
        return tax;
    }

}
