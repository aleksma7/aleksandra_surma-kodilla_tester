package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schoolDirectory = new HashMap<>();

        Principal principal1 = new Principal("Jeff Bezos");
        School gryffindor = new School("gryffindor",30, 25, 27, 23);

        Principal principal2 = new Principal("Mark Zuckenberg");
        School hufflepuff = new School("hufflepuff",32, 29, 26, 23);

        Principal principal3 = new Principal("Bill Gates");
        School ravenclaw = new School("ravenclaw",55, 48, 50, 58);

        Principal principal4 = new Principal("Elon Musk");
        School slytherin = new School("slytherin",8, 12, 10, 14);

        schoolDirectory.put(principal1, gryffindor);
        schoolDirectory.put(principal2, hufflepuff);
        schoolDirectory.put(principal3, ravenclaw);
        schoolDirectory.put(principal4, slytherin);

        for (Map.Entry<Principal, School> entry : schoolDirectory.entrySet()) {
            Principal principal = entry.getKey();
            School school = entry.getValue();

            int totalStudents = school.getClassSizes().stream().mapToInt(Integer::intValue).sum();

            System.out.println("Dyrektor: " + principal.getName());
            System.out.println("Szkoła: " + school.getClassSchoolName());
            System.out.println("Liczba uczniów: " + totalStudents);
        }
    }
}
