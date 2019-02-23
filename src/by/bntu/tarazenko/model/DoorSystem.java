package by.bntu.tarazenko.model;

public class DoorSystem implements TurnBehavior {
    @Override
    public String turnOn() {
        return "Door oepn.";
    }

    @Override
    public String turnOff() {
        return "Door close.";
    }
}
