package lab01.veterinary_report_example;

public class VeterinaryTest {
    public static void main(String[] args) {
        VeterinaryReport report1 = new VeterinaryReport();
        VeterinaryReport report2 = new VeterinaryReport();

        report1.dogs = 20;
        report1.cats = 30;

        report2.dogs = 40;
        report2.cats = 50;

        report1.displayStatistics("October");
        report2.displayStatistics("October");

        // This doesn't change the dogs attribute in the second report
        // as the instances have separate data spaces aka they reference separate memory areas
        report1.dogs = 5;

        report1.displayStatistics("October");
        report2.displayStatistics("October");
    }
}
