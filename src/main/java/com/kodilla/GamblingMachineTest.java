package parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTest {
    @ParameterizedTest
    @CsvFileSource(resources = "gamblingMachineNumberOfElements.csv")
    public void shouldThrowExceptionWhenWrongNumberOfNumbers(String input) {
        String[] numbersAsStrings = input.split("-");
        Set<Integer> inputSet = new HashSet<>();
        for (String number : numbersAsStrings) {
            inputSet.add(Integer.parseInt(number));
        }
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputSet));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "gamblingMachineNumbersOutOfScope.csv")
    public void shouldThrowExceptionWhenNumberIsOutOfScope(String input) {
        String[] numbersAsStrings = input.split("-");
        Set<Integer> inputSet = new HashSet<>();
        for (String number : numbersAsStrings) {
            inputSet.add(Integer.parseInt(number));
        }
        GamblingMachine gamblingMachine = new GamblingMachine();
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(inputSet));
    }
    @ParameterizedTest
    @CsvFileSource(resources = "gamblingMachineGoodNumbers.csv")
    public void shouldCalculateNumberOfWins(String input) throws InvalidNumbersException {
        String[] numbersAsStrings = input.split("-");
        Set<Integer> inputSet = new HashSet<>();
        for (String number : numbersAsStrings) {
            inputSet.add(Integer.parseInt(number));
        }
        GamblingMachine gamblingMachine = new GamblingMachine();
        int howManyWins = gamblingMachine.howManyWins(inputSet);
        assertTrue(howManyWins >= 0 && howManyWins <= 6);
    }
}
