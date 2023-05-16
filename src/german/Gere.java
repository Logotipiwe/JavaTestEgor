package german;

import examples.interfaces.GermanHier;
import examples.interfaces.HierBuyer;

public class Gere {
    public static void main(String[] args) {
        GermanHier germanHier = new GermanHier();
        say(germanHier);
    }


    private static void say(HierBuyer hierBuyer){
        hierBuyer.sayHi();
        hierBuyer.sayBye();
    }
}
