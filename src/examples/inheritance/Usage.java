package examples.inheritance;

public class Usage {
    public static void main(String[] args) {
        Child child = new Child();
        Small small = new Small();
        System.out.println(child.papaName);
        System.out.println(child.papaName3);

        System.out.println(child.sayHi());
        System.out.println(small.sayHi());
    }
}
