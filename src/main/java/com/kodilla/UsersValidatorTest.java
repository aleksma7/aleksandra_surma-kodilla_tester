package parametrized_tests;

import com.kodilla.parametrized_tests.homework.UsersValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersValidatorTest {

    @Test
    public void shouldReturnTrueForValidEmail() {
        UsersValidator validator = new UsersValidator();
        String validEmail = "example@example.com";
        boolean result = validator.validateEmail(validEmail);
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForInvalidEmail() {
        UsersValidator validator = new UsersValidator();
        String invalidEmail = "invalid.email";
        boolean result = validator.validateEmail(invalidEmail);
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForNullEmail() {
        UsersValidator validator = new UsersValidator();
        boolean result = validator.validateEmail(null);
        assertFalse(result);
    }

}
