package by.bntu.tarazenko.model;

public class LightSystem implements TurnBehavior {

    @Override
    public String turnOn() {
        return  "Light on.";
    }

    @Override
    public String turnOff() {
        return "Light off.";
    }
}
