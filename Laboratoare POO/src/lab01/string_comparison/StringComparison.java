package lab01.string_comparison;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        // this reference declaration points makes both s1 and s2 point to the memory zone
        // in the String Pool where the immutable literal "Hello" resides
        String s1 = "Hello";
        String s2 = "Hello";

        // this compares references not content
        System.out.print("Comparing s1 with s2 reference wise yields: ");
        System.out.println(s1 == s2);

        // so if we have something like this
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        // it would not work as they refer different memory zones on the heap
        System.out.print("Comparing s3 with s4 reference wise yields: ");
        System.out.println(s3 == s4);

        // and so we would use this method which is safe in all cases, because it compares content
        System.out.print("Comparing s3 with s4 content wise yields: ");
        System.out.println(s3.equals(s4));

        // and now you may ask yourself why not always create strings using the String Pool method?
        // the answer lies in the fact that to allocate space for strings in the String Pool
        // this needs to be done at compile time
        // an example:

        Scanner sc = new Scanner(System.in);
        // read the same content
        String stdinStr1 = sc.nextLine();
        String stdinStr2 = sc.nextLine();

        System.out.print("Comparing stdinStr1 with stdinStr2 reference wise yields: ");
        System.out.println(stdinStr1 == stdinStr2);

        System.out.print("Comparing stdinStr1 with stdinStr2 content wise yields: ");
        System.out.println(stdinStr1.equals(stdinStr2));
    }
}
