package parametrized_tests;

import com.kodilla.parametrized_tests.homework.GamblingMachine;
import com.kodilla.parametrized_tests.homework.InvalidNumbersException;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTest {
    @Test
    void testHowManyWins() throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();

        Set<Integer> userNumbers1 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6));
        int wins1 = gamblingMachine.howManyWins(userNumbers1);
        assertEquals(6, wins1);

        Set<Integer> userNumbers2 = new HashSet<>(Set.of(7, 8, 9, 10, 11, 12));
        int wins2 = gamblingMachine.howManyWins(userNumbers2);
        assertEquals(0, wins2);

        Set<Integer> userNumbers3 = new HashSet<>(Set.of(1, 7, 14, 21, 28, 35));
        int wins3 = gamblingMachine.howManyWins(userNumbers3);
        assertTrue(wins3 > 0 && wins3 < 6);
    }

    @Test
    void testInvalidNumbersException() {
        GamblingMachine gamblingMachine = new GamblingMachine();

        Set<Integer> invalidNumbers1 = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidNumbers1));

        Set<Integer> invalidNumbers2 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 6, 7));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidNumbers2));

        Set<Integer> invalidNumbers3 = new HashSet<>(Set.of(1, 2, 3, 4, 5, 60));
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(invalidNumbers3));
    }
}
