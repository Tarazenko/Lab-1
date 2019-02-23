package by.bntu.tarazenko.model;

public class Door extends SmartHouse {

    @Override
    public String display() {
        return  "It's the door.";
    }

    public Door() {
        setTurnBehavior(new DoorSystem());
    }
}
