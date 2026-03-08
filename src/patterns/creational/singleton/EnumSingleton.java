package patterns.creational.singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("Enum Singleton running");
    }
}
