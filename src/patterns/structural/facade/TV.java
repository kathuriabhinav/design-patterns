package patterns.structural.facade;

// Subsystem class
public class TV {

    public void on() {
        System.out.println("TV on");
    }

    public void off() {
        System.out.println("TV off");
    }

    public void setInput(String input) {
        System.out.println("TV input set to " + input);
    }
}
