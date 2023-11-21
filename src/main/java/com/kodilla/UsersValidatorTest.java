package parametrized_tests;

import com.kodilla.parametrized_tests.homework.UsersValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsersValidatorTest {

    @Test
    public void shouldReturnTrueForValidEmail() {
        // Arrange
        UsersValidator validator = new UsersValidator();
        String validEmail = "test@example.com";

        // Act
        boolean result = validator.validateEmail(validEmail);

        // Assert
        assertTrue(result);
    }

    @Test
    public void shouldReturnFalseForInvalidEmail() {
        // Arrange
        UsersValidator validator = new UsersValidator();
        String invalidEmail = "invalid.email";

        // Act
        boolean result = validator.validateEmail(invalidEmail);

        // Assert
        assertFalse(result);
    }

    @Test
    public void shouldReturnFalseForNullEmail() {
        // Arrange
        UsersValidator validator = new UsersValidator();

        // Act
        boolean result = validator.validateEmail(null);

        // Assert
        assertFalse(result);
    }

}
