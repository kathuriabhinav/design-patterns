interface Command {
    void execute();
}

class Light {
    void on() {
        System.out.println("Light ON");
    }

    void off() {
        System.out.println("Light OFF");
    }
}

class OnCommand implements Command {
    private Light light;
    OnCommand(Light light) { this.light = light; }
    public void execute() { light.on(); }
}

class OffCommand implements Command {
    private Light light;
    OffCommand(Light light) { this.light = light; }
    public void execute() { light.off(); }
}

// Client 
class Remote {
    private Command command;
    void setCommand(Command command) { this.command = command; }
    void press() { command.execute(); }
}

public class CommandDemo {
    public static void main(String[] args) {
        Light light = new Light();
        Remote remote = new Remote();

        remote.setCommand(new OnCommand(light));
        remote.press();

        remote.setCommand(new OffCommand(light));
        remote.press();
    }
}
