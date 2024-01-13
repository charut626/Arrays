import java.util.HashSet;
public class LongestConsecutiveSubsequence{
    public static int longestConsecutive(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0;
        }
//      Create a HashSet to store the unique elements of the array
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int longestStreak = 0;
//      Iterate through the array to find the start of consecutive sequences
        for (int i = 0; i < arr.length; i++) {
//      If the current number is the start of a sequence (i.e., no num-1 is present in the set),
//       then check the length of the consecutive sequence
            if (!set.contains(arr[i] - 1)) {
                int currentNum = arr[i];
                int currentStreak = 1;

                // Check the length of the consecutive sequence
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                // Update the longest streak if the current sequence is longer
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));    //Longest Consecutive Subsequence is 1,2,3,4 of length 4.
    }
}
//  Time Complexity of above program is: O(n)