package lab02.constructors;

public class ConstructorsMain {
    public static void main(String[] args) {
        Student st; // this is declaration
        st = new Student(20, "Ioana", 2); // this is the instantiation using the 3 parameter constructor
        System.out.println(st);

        Student st1 = new Student(20, "Alex"); // declaration on the left and instantiation on the right with 2 parameter constructor
        System.out.println(st1);

        Student st2 = new Student(); // usage of the no parameter constructor
        System.out.println(st2);

        Student st3 = new Student(st); // usage of the copy constructor
        System.out.println(st3);
    }
}
