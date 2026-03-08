package patterns.creational.singleton;

public class SingletonDemo {

    public static void main(String[] args) {
        // Lazy Singleton
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();
        System.out.println("Lazy - Same instance? " + (lazy1 == lazy2));

        // Thread-Safe Singleton
        ThreadSafeSingleton ts1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton ts2 = ThreadSafeSingleton.getInstance();
        System.out.println("ThreadSafe - Same instance? " + (ts1 == ts2));

        // Enum Singleton
        EnumSingleton e1 = EnumSingleton.INSTANCE;
        EnumSingleton e2 = EnumSingleton.INSTANCE;
        e1.doSomething();
        System.out.println("Enum - Same instance? " + (e1 == e2));
    }
}
