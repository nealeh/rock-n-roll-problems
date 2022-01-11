package challenges;

// Write the code to determine whether a pair of Linkin Park songs share the same 3-character ending.
// Ignore letter case.
public class InTheEnd {

    public static boolean checkEnding(String song1, String song2) {
        int song1Length = song1.length();
        int song2Length = song2.length();

        if (song1Length < 3 || song2Length < 3) {
            return false;
        }
        String song1Ending = song1.toLowerCase().substring(song1Length - 3, song1Length);
        String song2Ending = song2.toLowerCase().substring(song2Length - 3, song2Length);

        return song1Ending.equals(song2Ending);
    }

}
