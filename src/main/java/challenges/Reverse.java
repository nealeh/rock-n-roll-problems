package challenges;

// Write the code to reverse the back-to-front song passed as a String
public class Reverse {

    public static String reverseSong(String song) {
        var sb = new StringBuilder();
        for (int i=song.length()-1; i>=0; i--) {
            sb.append(song.charAt(i));
        }
        return sb.toString();
    }

}
