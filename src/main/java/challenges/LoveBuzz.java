package challenges;

// Write the code to return "Love" if the input is divisible by 3, "Buzz"
// if it is divisible by 5, "Love Buzz" if it is divisible by both. Otherwise return the input.
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
