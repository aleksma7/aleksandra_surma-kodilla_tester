package parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @ParameterizedTest
    @MethodSource(value = "parametrized_tests.PersonTest#provideBmiAsAText")
    public void shouldCalculateBMI(double height, int weight, String expected) {
        Person person = new Person(height, weight);
        assertEquals(expected, person.getBMI() );

    }

    private static Stream<Arguments> provideBmiAsAText() {
        return Stream.of(
                Arguments.of(1.7, 35, "Very severely underweight"),
                Arguments.of(1.6, 204, "Obese Class VI (Hyper Obese)"),
                Arguments.of(1.82, 51, "Severely underweight"),
                Arguments.of(1.53, 42, "Underweight"),
                Arguments.of(1.67, 64, "Normal (healthy weight)"),
                Arguments.of(1.95, 110, "Overweight"),
                Arguments.of(1.95, 126, "Obese Class I (Moderately obese)"),
                Arguments.of(1.95, 141, "Obese Class II (Severely obese)"),
                Arguments.of(1.73, 133, "Obese Class III (Very severely obese)"),
                Arguments.of(1.65, 133, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(1.77, 186, "Obese Class V (Super Obese)")
                );
    }
}
