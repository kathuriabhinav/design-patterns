package patterns.singleton.threadSafeSingleton;

public class ThreadSafeSingletonDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            Singleton s = Singleton.getInstance();
            System.out.println("Instance hash: " + s.hashCode());
        };

        // simulate multiple threads
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);

        t1.start();
        t2.start();
        t3.start();
    }
}
