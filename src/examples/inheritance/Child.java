package examples.inheritance;

public class Child extends Parent{
    @Override
    public String sayHi() {
        return super.sayHi() + " AMA CHILDDDD";
    }
}
