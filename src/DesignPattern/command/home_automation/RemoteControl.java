package designpatterns.command.home_automation;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
    List<Command> slotOn;
    List<Command> slotOff;

    RemoteControl() {
        slotOn = new ArrayList<>();
        slotOff = new ArrayList<>();
    }

    void setCommand(int slotNumber, Command slotOnCommand, Command slotOffCommand) {
        slotOn.add(slotNumber, slotOnCommand);
        slotOff.add(slotNumber, slotOffCommand);
    }

    void on(int slotNumber) {
        slotOn.get(slotNumber).execute();
    }

    void off(int slotNumber) {
        slotOff.get(slotNumber).execute();
    }
}
