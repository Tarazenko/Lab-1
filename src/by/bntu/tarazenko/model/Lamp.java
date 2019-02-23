package by.bntu.tarazenko.model;

public class Lamp extends SmartHouse {

    @Override
    public String display() {
        return  "It's the lamp.";
    }

    public Lamp() {
        setTurnBehavior(new LightSystem());
    }
}
