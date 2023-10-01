package com.kodilla.abstracts.homework;

public class People {
    public static void main(String[] args) {
        Accountant accountant = new Accountant(4700);
        Teacher teacher = new Teacher(4200, "Students education and mentoring, lesson plans and exams preparation, asigning homework");
        Engineer engineer = new Engineer(7000, "Providing solutions to technical problems, designing/building/maintaining");

        Person person1 = new Person("Mia", 30, accountant);
        Person person2 = new Person("Hannah", 27, teacher);
        Person person3 = new Person("Rose",25, engineer);

        person1.displayResponsibilities();
        person2.displayResponsibilities();
        person3.displayResponsibilities();

    }
}
