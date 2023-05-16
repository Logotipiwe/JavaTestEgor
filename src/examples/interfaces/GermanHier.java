package examples.interfaces;

public class GermanHier implements HierBuyer {
    @Override
    public void sayHi() {
        System.out.println("HI");
    }

    @Override
    public void sayBye() {
        System.out.println("BYU");
    }
}
