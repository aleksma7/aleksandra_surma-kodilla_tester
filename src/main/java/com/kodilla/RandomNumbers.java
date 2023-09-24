package com.kodilla;

import java.util.Random;

public class RandomNumbers {
    private int currentSum;
    private int minRandomValue;
    private int maxRandomValue;

    public RandomNumbers() {
        currentSum = 0;
        minRandomValue = 30;
        maxRandomValue = 0;
    }

    public void createRandomNumbers() {
        Random random = new Random();

        while (currentSum <= 5000) {
            int randomNumber = random.nextInt(31);
            currentSum += randomNumber;

            if (randomNumber < minRandomValue) {
                minRandomValue = randomNumber;
            }
            if (randomNumber > maxRandomValue) {
                maxRandomValue = randomNumber;
            }
        }
    }

    public int getMinRandomValue() {
        return minRandomValue;
    }

    public int getMaxRandomValue() {
        return maxRandomValue;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.createRandomNumbers();

        System.out.println("Najmniejsza wylosowana wartość:" + " " + randomNumbers.getMinRandomValue());
        System.out.println("Największa wylosowana wartość:" + " " + randomNumbers.getMaxRandomValue());
    }
}
