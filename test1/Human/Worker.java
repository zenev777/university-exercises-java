public class Worker extends Human {

    private int workingHours;
    public Worker(String firstName, String lastName) {
        super(firstName, lastName);
        workingHours=8;
    }

    @Override
    int calculateDailyWage() {
        return workingHours*11;
    }
}
