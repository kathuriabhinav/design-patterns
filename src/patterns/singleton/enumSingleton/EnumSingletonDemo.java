package patterns.singleton.enumSingleton;

public class EnumSingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;

        s1.print();
        System.out.println("Are both instances same? " + (s1 == s2));
    }
}
