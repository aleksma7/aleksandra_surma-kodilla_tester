package com.kodilla.inheritance.homework;

public class Systems {

    public static void main(String[] args) {
        Windows windows = new Windows(1985);
        MacOS macos = new MacOS(2001);

        windows.turnOn();
        windows.turnOff();

        macos.turnOn();
        macos.turnOff();
    }
}
