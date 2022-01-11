package challenges;

import java.util.List;

// Which of these classics are palindromes? Letter case and special characters can be ignored.
public class Palindrome {

    public static boolean isPalindrome(String song) {
        song = song.toLowerCase().replaceAll("[, /s]", "");
        var sb = new StringBuilder();
        for (int i= song.length()-1; i>=0; i--) {
            sb.append(song.charAt(i));
        }
        return sb.toString().equals(song);
    }
}
