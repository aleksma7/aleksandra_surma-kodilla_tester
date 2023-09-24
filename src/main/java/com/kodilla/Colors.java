package com.kodilla;

import java.util.Scanner;
public class Colors {
    public static String provideColorName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide first letter of the color:" + " ");
        String userSelection = scanner.nextLine().trim().toUpperCase();

        return switch (userSelection) {
            case "W" -> "White";
            case "Y" -> "Yellow";
            case "O" -> "Orange";
            case "R" -> "Red";
            case "P" -> "Pink";
            case "B" -> "Black";
            case "G" -> "Grey";
            default -> "Wrong letter, try different one";
        };
    }
    public static void main(String[] args) {
        String colorName = provideColorName();
        System.out.println("Full color name:" + " " + colorName);
    }
}
