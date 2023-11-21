package com.kodilla.stream.optional.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

    @Test
    public void testAveragePostCountForUsersOver40() {
        List<User> users = Arrays.asList(
                new User("User1", 45, 5, "Group1"),
                new User("User2", 50, 10, "Group2"),
                new User("User3", 35, 2, "Group1")
        );

        ForumStats forumStats = new ForumStats();
        double result = forumStats.getAveragePostCountForUsersOver40(users);

        assertEquals(7.5, result, 0.001);
    }

    @Test
    public void testAveragePostCountForUsersUnder40() {
        List<User> users = Arrays.asList(
                new User("User1", 45, 5, "Group1"),
                new User("User2", 30, 8, "Group2"),
                new User("User3", 35, 2, "Group1")
        );

        ForumStats forumStats = new ForumStats();
        double result = forumStats.getAveragePostCountForUsersUnder40(users);

        assertEquals(5.0, result, 0.001);
    }
}
