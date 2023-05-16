package examples.inheritance;

public class Small extends Parent {
    @Override
    public String sayHi() {
        return super.sayHi() + "AMA smal";
    }
}
