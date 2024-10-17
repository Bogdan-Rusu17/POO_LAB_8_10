package lab02.singleton;

public class SingletonMain {
    public static void main(String[] args) {
        LazySingletonLibrary lazyLibrary = LazySingletonLibrary.getInstance();

        lazyLibrary.addBook("Analiza Algoritmilor");
        lazyLibrary.addBook("Dispozitive electronice si electronica analogica");

        System.out.println(lazyLibrary + "\n\n");



        EagerSingletonAdmin eagerSingletonAdmin = EagerSingletonAdmin.getInstance();

        eagerSingletonAdmin.addCommand("Remove user");
        eagerSingletonAdmin.addCommand("Add user");

        System.out.println(eagerSingletonAdmin + "\n\n");
    }
}
