package patterns.singleton.lazyInstantiationSingleton;

public class Singleton {
    // The one and only instance
    private static Singleton instance;

    // Private constructor prevents external instantiation
    private Singleton() {
        System.out.println("Singleton instance created");
    }

    // Lazy initialization — instance created when first requested
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
