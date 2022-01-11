package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    public void testReverseSong() {
        assertEquals("Erase/Rewind", Reverse.reverseSong("dniweR/esarE")); //The Cardigans
        assertEquals("Sideways in Reverse", Reverse.reverseSong("esreveR ni syawediS")); // Mark Lanegan Band
        assertEquals("Robin Hood in Reverse", Reverse.reverseSong("esreveR ni dooH niboR")); // Bad Religion
        assertEquals("Rewind the Film", Reverse.reverseSong("mliF eht dniweR")); // Manic Street Preachers
        assertEquals("Rearviewmirror", Reverse.reverseSong("rorrimweivraeR")); // Pearl Jam
    }

}