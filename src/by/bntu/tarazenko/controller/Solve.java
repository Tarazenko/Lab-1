package by.bntu.tarazenko.controller;

import by.bntu.tarazenko.model.Door;
import by.bntu.tarazenko.model.Lamp;
import by.bntu.tarazenko.model.SmartHouse;
import by.bntu.tarazenko.util.UserInput;
import by.bntu.tarazenko.view.Printer;

import java.util.HashMap;

public class Solve {
    public static void main(String[] args) {
        HashMap<String, SmartHouse> map = new HashMap<String, SmartHouse>();

        map.put("Lamp", new Lamp());
        map.put("Door", new Door());

        Printer.print("Choose item(Lamp/Door): ");
        SmartHouse activeItem = map.get(UserInput.inputString());
        Printer.print(activeItem.display());
        Printer.print("On/Off");
        Printer.print(activeItem.choose(UserInput.inputString()));
    }
}
