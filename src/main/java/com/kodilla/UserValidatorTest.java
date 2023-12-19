package parametrized_tests;

import com.kodilla.parametrized_tests.homework.UserValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTest {

    private final UserValidator userValidator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"user123", "john.doe", "user_name"})
    void shouldValidateCorrectUsernames(String validUsername) {
        assertTrue(userValidator.validateUsername(validUsername));
    }

    @ParameterizedTest
    @ValueSource(strings = {"us", "user@name", "user!123"})
    void shouldNotValidateIncorrectUsernames(String invalidUsername) {
        assertFalse(userValidator.validateUsername(invalidUsername));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@example.com", "john.doe@gmail.com", "user_name@domain.co"})
    void shouldValidateCorrectEmails(String validEmail) {
        assertTrue(userValidator.validateEmail(validEmail));
    }

    @ParameterizedTest
    @ValueSource(strings = {"user@.com", "john.doe@gmail", "user!name@domain"})
    void shouldNotValidateIncorrectEmails(String invalidEmail) {
        assertFalse(userValidator.validateEmail(invalidEmail));
    }
}
