package egor;

import egor.interfaces.Speakable;

import java.util.ArrayList;
import java.util.List;

public class House {
    private List<Speakable> houseLivers = new ArrayList<>();
    public String houseName;
    public Integer limit;
    public House addMember (Speakable liver) {
        if(houseLivers.size() >= limit){
            throw new RuntimeException("ARE YOU GEY");
        }
        houseLivers.add(liver);
        return this;
    }

    public void sayAll () {
        for (Speakable item:houseLivers) {
            item.say();
        }
    }

    public void calculateTaxes() {
        Integer count = 0;
        for (Speakable item:houseLivers) {
            count += item.getTax();
        }
        System.out.println(count);
    }

    public House(String houseName,
                 Integer limit,
                 Integer limit1,
                 Integer limit2,
                 Integer limit3,
                 Integer limit4,
                 Integer limi5t,
                 Integer li76mit,
                 Integer li7mit,
                 Integer li8mit
         ) {
        this.houseName = houseName;
        this.limit = limit;
    }

}
