package challenges;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LoveBuzzTest {

    @Test
    public void loveBuzz() {
        assertEquals("Love", LoveBuzz.loveBuzz(3));
        assertEquals("Buzz", LoveBuzz.loveBuzz(5));
        assertEquals("Love Buzz", LoveBuzz.loveBuzz(15));
        assertEquals("2", LoveBuzz.loveBuzz(2));
    }

}