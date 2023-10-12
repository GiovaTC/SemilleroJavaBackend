import org.example.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzzForMultipleOf3And5() {
        Main FizzBuzz = null;
        assertEquals("FizzBuzz", FizzBuzz.getResult(15));
        assertEquals("FizzBuzz", FizzBuzz.getResult(30));
        // Agrega más casos según sea necesario
    }

    @Test
    public void testFizzBuzzForMultipleOf3() {
        Main FizzBuzz = null;
        assertEquals("Fizz", FizzBuzz.getResult(9));
        assertEquals("Fizz", FizzBuzz.getResult(12));
        // Agrega más casos según sea necesario
    }

    @Test
    public void testFizzBuzzForMultipleOf5() {
        Main FizzBuzz = null;
        assertEquals("Buzz", FizzBuzz.getResult(10));
        assertEquals("Buzz", FizzBuzz.getResult(20));
        // Agrega más casos según sea necesario
    }

    @Test
    public void testFizzBuzzForOtherNumbers() {
        Main FizzBuzz = null;
        assertEquals("1", FizzBuzz.getResult(1));
        assertEquals("2", FizzBuzz.getResult(2));
        assertEquals("4", FizzBuzz.getResult(4));
        // Agrega más casos según sea necesario
    }
}
