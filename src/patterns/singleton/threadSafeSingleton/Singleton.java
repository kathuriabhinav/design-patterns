package patterns.singleton.threadSafeSingleton;

public class Singleton {
    // volatile ensures changes are visible across threads
    private static volatile Singleton instance;

    private Singleton() {
        System.out.println("Thread-safe Singleton instance created");
    }

    public static Singleton getInstance() {
        if (instance == null) { // 1st check (no lock)
            synchronized (Singleton.class) {
                if (instance == null) { // 2nd check (with lock)
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
