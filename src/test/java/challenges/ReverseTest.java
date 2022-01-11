package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseTest {

    @Test
    public void testReverseSong() {
        assertEquals("dniweR/esarE", Reverse.reverseSong("Erase/Rewind")); //The Cardigans
        assertEquals("esreveR ni syawediS", Reverse.reverseSong("Sideways in Reverse")); // Mark Lanegan Band
        assertEquals("esreveR ni dooH niboR", Reverse.reverseSong("Robin Hood in Reverse")); // Bad Religion
        assertEquals("mliF eht dniweR", Reverse.reverseSong("Rewind the Film")); // Manic Street Preachers
        assertEquals("rorrimweivraeR", Reverse.reverseSong("Rearviewmirror")); // Pearl Jam
    }

}