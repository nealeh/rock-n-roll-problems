package challenges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("TNT")); // AC/DC
        assertEquals(true, Palindrome.isPalindrome("Live Evil")); // Black Sabbath
        assertEquals(false, Palindrome.isPalindrome("I Palindrome I")); // They Might be Giants
        assertEquals(false, Palindrome.isPalindrome("Hey Hey, My My")); // Neil Young
        assertEquals(true, Palindrome.isPalindrome("A Man, a Plan, a Canal, Panama")); // Van Halen
    }

}