package lab01.veterinary_report_example;

public class VeterinaryReport {
    int dogs;
    int cats;

    public int getAnimalsCount() {
        return dogs + cats;
    }

    public int getDogsCount() {
        return dogs;
    }

    public int getCatsCount() {
        return cats;
    }

    /**
     * Returns the total number of animals in the current instance of the veterinary report
     *
     * @param currentMonth - the current month we are displaying statistics for
     */
    public void displayStatistics(String currentMonth) {
        System.out.println("The total number of animals for " + currentMonth + " is " + getAnimalsCount());
    }
}
