package designpatterns.command.home_automation;

public class LightsOffCommand implements Command {
    Light light;

    LightsOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }
}
