package challenges;

// Write the code that will find the indices of two integers that add up to 41.
// If there are no such indices return an empty array.
public class TwoSum41 {

    public static int[] sum(int[] arr) {
        final int target = 41;
        for (int i=0; i<arr.length-1; i++) {
            for (int j=1; j<arr.length-1; j++) {
                if (arr[i] + (arr[j]) == target) {
                    return new int[]{arr[i], arr[j]};
                }
            }
        }
        return new int[]{};
    }

}
