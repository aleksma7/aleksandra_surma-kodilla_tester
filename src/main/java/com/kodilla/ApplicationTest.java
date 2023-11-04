package com.kodilla.stream.optional.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTest {
    @Test
    public void testStudentWithTeacher() {
        Teacher teacher = new Teacher("Grzegorz Brzęczyszczykiewicz");
        Student student = new Student("John McMurry", teacher);

        assertEquals("John McMurry", student.getName());
        assertNotNull(student.getTeacher());
        assertEquals("Grzegorz Brzęczyszczykiewicz", student.getTeacher().getName());
    }

    @Test
    public void testStudentWithoutTeacher() {
        Student student = new Student("Peter Atkins", null);

        assertEquals("Peter Atkins", student.getName());
        assertNull(student.getTeacher());
    }

    @Test
    public void testDisplayStudentTeacherPairWithTeacher() {
        Teacher teacher = new Teacher("Grzegorz Brzęczyszczykiewicz");
        Student student = new Student("John McMurry", teacher);

        String expectedOutput = "Uczeń: John McMurry, nauczyciel: Grzegorz Brzęczyszczykiewicz";
        String actualOutput = Application.displayStudentTeacherPair(student);

        assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testDisplayStudentTeacherPairWithoutTeacher() {
        Student student = new Student("Peter Atkins", null);

        String expectedOutput = "Uczeń: Peter Atkins, nauczyciel: <undefined>";
        String actualOutput = Application.displayStudentTeacherPair(student);

        assertEquals(expectedOutput, actualOutput);
    }
}
