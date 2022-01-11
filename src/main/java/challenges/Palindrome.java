package challenges;

// Write the code to return whether the song is a palindrome or not.
// Letter case and special characters can be ignored.
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
