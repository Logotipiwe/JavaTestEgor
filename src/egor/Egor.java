package egor;

public class Egor {
    public static void main(String[] args) {
        Student egor = new Student();
        Employee german = new Employee();

        String houseName = "COOL HOUSE";
        Integer limit = 3;
        House house = new House(houseName, limit,
                12342,
                12342,
                null,
                12342,
                null,
                12342,
                null,
                12342
        );
        house.addMember(egor).addMember(german).addMember(german);
//        house.addMember(german); //throw new Error()
//        house.sayAll(); //все кто в хаусе делают say()
//        house.calculateTaxes(); //10 за каждого студента, 100 за работника
        /*
        * PizzaBuilder builder = new PizzaBuilder();
        * builder.setPeproni(YES);
        * builder.setCheese(YES);
        * if(isSizeProvided()){
        *   builder.setSize(size);
        * }
        *
        * Pizza pizza = builder.build();
        *
        * */
    }
}
