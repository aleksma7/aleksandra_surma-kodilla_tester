package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {

    public double getAveragePostCountForUsersOver40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public double getAveragePostCountForUsersUnder40(List<User> users) {
        return users.stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        List<User> users = UsersRepository.getUsersList(); // Użyj statycznej metody z UsersRepository

        ForumStats forumStats = new ForumStats();

        double averagePostsAbove40 = forumStats.getAveragePostCountForUsersOver40(users);
        double averagePostsBelow40 = forumStats.getAveragePostCountForUsersUnder40(users);

        System.out.println("Średnia liczba postów dla użytkowników >= 40 lat: " + averagePostsAbove40);
        System.out.println("Średnia liczba postów dla użytkowników < 40 lat: " + averagePostsBelow40);
    }
}
