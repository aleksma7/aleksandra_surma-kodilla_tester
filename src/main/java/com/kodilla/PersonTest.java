package parametrized_tests;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {
    @Test
    public void testGetBMIForNormalWeight() {
        Person person = new Person(1.75, 70);

        assertEquals("Normal (healthy weight)", person.getBMI());
    }

    @Test
    public void testGetBMIForUnderweight() {
        Person person = new Person(1.65, 45);

        assertEquals("Underweight", person.getBMI());
    }

    @Test
    public void testGetBMIForOverweight() {
        Person person = new Person(1.75, 90);

        assertEquals("Overweight", person.getBMI());
    }
    @Test
    public void testGetBMIVerySeverelyUnderweight() {
        Person person = new Person(1.60, 30);

        assertEquals("Very severely underweight", person.getBMI());
    }
    @Test
    public void testGetBMIUnderweight() {
        Person person = new Person(1.70, 50);

        assertEquals("Underweight", person.getBMI());
    }

    @Test
    public void testGetBMIObeseClassI() {
        Person person = new Person(1.80, 100);

        assertEquals("Obese Class I (Moderately obese)", person.getBMI());
    }

    @Test
    public void testGetBMIObeseClassIII() {
        Person person = new Person(1.65, 110);

        assertEquals("Obese Class III (Very severely obese)", person.getBMI());
    }

    public static class TestData {

        public static Person underweightPerson() {
            return new Person(1.60, 45);
        }

        public static Person normalWeightPerson() {
            return new Person(1.75, 70);
        }

        public static Person overweightPerson() {
            return new Person(1.75, 90);
        }

        public static Person obeseClassIIPerson() {
            return new Person(1.70, 120);
        }

        public static Person obeseClassVPerson() {
            return new Person(1.60, 200);
        }
    }

    public static class PersonTestWithTestData {

        @Test
        public void testGetBMIForUnderweight() {
            Person person = TestData.underweightPerson();

            assertEquals("Underweight", person.getBMI());
        }

        @Test
        public void testGetBMIForNormalWeight() {
            Person person = TestData.normalWeightPerson();

            assertEquals("Normal (healthy weight)", person.getBMI());
        }

        @Test
        public void testGetBMIForOverweight() {
            Person person = TestData.overweightPerson();

            assertEquals("Overweight", person.getBMI());
        }

        @Test
        public void testGetBMIForObeseClassII() {
            Person person = TestData.obeseClassIIPerson();

            assertEquals("Obese Class II (Severely obese)", person.getBMI());
        }
    }
}