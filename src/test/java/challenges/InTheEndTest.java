package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InTheEndTest {

    @Test
    public void testCheckEnding() {
        assertEquals(true, InTheEnd.checkEnding("Halfway Right", "One More Light"));
        assertEquals(true, InTheEnd.checkEnding("Pushing Me Away", "Runaway"));
        assertEquals(false, InTheEnd.checkEnding("Shadow of the Day", "The Little Things Give You Away"));
        assertEquals(false, InTheEnd.checkEnding("Iridescent", "Crawling"));
        assertEquals(true, InTheEnd.checkEnding("Until It's Gone", "What I've Done"));
    }
}