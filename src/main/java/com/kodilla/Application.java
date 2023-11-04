package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Grzegorz Brzęczyszczykiewicz");
        Teacher teacher2 = new Teacher("Franciszek Dolas");

        List<Student> students = new ArrayList<>();
        students.add(new Student("John McMurry", teacher1));
        students.add(new Student("Adam Bielański", teacher2));
        students.add(new Student("Peter Atkins", null));

        for (Student student : students) {
            String studentName = student.getName();
            String teacherName = Optional.ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>");

            System.out.println("Uczeń: " + studentName + ", nauczyciel: " + teacherName);
        }
    }

    public static String displayStudentTeacherPair(Student student) {
        String studentName = student.getName();
        String teacherName = Optional.ofNullable(student.getTeacher())
                .map(Teacher::getName)
                .orElse("<undefined>");

        return "Uczeń: " + studentName + ", nauczyciel: " + teacherName;
    }
}
