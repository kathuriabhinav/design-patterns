package patterns.singleton.enumSingleton;

public enum Singleton {
    INSTANCE; // the only instance

    public void print() {
        System.out.println("Enum Singleton instance running");
    }
}
