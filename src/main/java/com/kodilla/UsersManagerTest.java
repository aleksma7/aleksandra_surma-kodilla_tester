package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class UsersManagerTest {
    @Test
    public void testFilterChemistGroupUsernames() {
        // Given
        List<String> expectedUsernames = List.of("Walter White", "Gale Boetticher");

        // When
        List<String> chemistGroupUsernames = UsersManager.filterChemistGroupUsernames();

        // Then
        assertEquals(expectedUsernames, chemistGroupUsernames);
    }

    @Test
    public void testGetUsersOlderThanAge() {
        // Given
        int ageThreshold = 40;

        // When
        List<User> usersOlderThanAge = UsersManager.getUsersOlderThanAge(ageThreshold);

        // Then
        assertEquals(4, usersOlderThanAge.size());
    }
    @Test
    public void testCustomStream() {
        // Given
        List<String> expectedUsernames = List.of("Jessie Pinkman");

        // When
        List<String> salesGroupUsernames = UsersManager.getSalesGroupUsernames();

        // Then
        assertEquals(expectedUsernames, salesGroupUsernames);
    }
}