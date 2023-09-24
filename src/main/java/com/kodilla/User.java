package com.kodilla;

public class User {
    private String name;
    private int age;
    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String provideName() {
        return name;
    }
    public int provideAge() {
        return age;
    }
    public static void main(String[] args) {
        User[] users = new User [10];

        users[0] = new User("Kasia", 20);
        users[1] = new User("Basia",34);
        users[2] = new User("Zosia", 4);
        users[3] = new User("Artur", 17);
        users[4] = new User("Marek", 41);
        users[5] = new User("Bogusia", 66);
        users[6] = new User("Darek", 45);
        users[7] = new User("Bodzio", 70);
        users[8] = new User("Asia", 25);
        users[9] = new User("Andrzej",15 );

        int sumAge = 0;
        for (User user : users) {
            sumAge += user.provideAge();
        }
        double averageAge = (double) sumAge / users.length;

        System.out.println("Osoby, których wiek jest poniżej średniej to :");
        for (User user : users) {
            if (user.provideAge() < averageAge) {
                System.out.println(user.provideName());
            }
        }
    }
}
