package lab01.arrays;

public class Arrays {
    public static void main(String[] args) {
        // first allocate space for 4 students (space for 4 references to Student objects)
        Student[] students = new Student[4];

        // then allocate space for each Student object
        students[0] = new Student();
        students[0].setName("James");
        students[0].setYear(2);

        students[1] = new Student();
        students[1].setName("Mary");
        students[1].setYear(1);

        students[2] = new Student();
        students[2].setName("Andreea");
        students[2].setYear(3);

        students[3] = new Student();
        students[3].setName("Stephanie");
        students[3].setYear(4);

        // C style for
        System.out.println("C style for:");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        // enhanced for loop that allows for indexless traversal
        System.out.println("\n\nEnhanced for:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
