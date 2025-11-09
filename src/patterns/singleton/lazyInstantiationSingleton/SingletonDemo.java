package patterns.singleton.lazyInstantiationSingleton;

public class SingletonDemo {
    public static void main(String[] args) {
        // Both calls return the same instance
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
