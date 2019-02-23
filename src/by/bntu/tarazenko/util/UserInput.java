package by.bntu.tarazenko.util;

import java.util.Scanner;

public class UserInput {
    static Scanner scanner = new Scanner(System.in);

    public static String inputString() {
        return scanner.nextLine();
    }
}
