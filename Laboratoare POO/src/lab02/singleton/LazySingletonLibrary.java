package lab02.singleton;

import java.util.ArrayList;
import java.util.List;

public class LazySingletonLibrary {
    private List<String> books = new ArrayList<>();
    // private instance attribute
    private static LazySingletonLibrary instance;

    // private constructor
    private LazySingletonLibrary() {}

    // public static method to get the singleton instance
    public static LazySingletonLibrary getInstance() {
        if (instance == null) {
            instance = new LazySingletonLibrary();
        }
        return instance;
    }

    public void addBook(String book) {
        getInstance().books.add(book);
    }

    @Override
    public String toString() {
        return "LazySingletonLibrary{" +
                "books=" + books +
                '}';
    }
}
