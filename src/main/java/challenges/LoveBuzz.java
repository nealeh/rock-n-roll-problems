package challenges;

// Fizz buzz with a twist of Nirvana
public class LoveBuzz {

    public static String loveBuzz(int a) {
        if (a % 15 == 0) {
            return "Love Buzz";
        } else if (a % 3 == 0) {
            return "Love";
        } else if (a % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(a);
    }

}
