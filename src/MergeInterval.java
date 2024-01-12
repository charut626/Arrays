import java.util.Arrays;
import java.util.Stack;
public class MergeInterval {
    static int[][] merge(int[][] arr) {
        Stack<int[]> stack = new Stack<>();
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        stack.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            int[] currentInterval = arr[i];
            int[] topOfStack = stack.pop();

            if (topOfStack[1] >= currentInterval[0]) {
                // Merge intervals
                int mergedStart = topOfStack[0];
                int mergedEnd = Math.max(topOfStack[1], currentInterval[1]);
                int[] mergedInterval = new int[]{mergedStart, mergedEnd};
                stack.add(mergedInterval);
            } else {
                // No overlap, push both intervals onto the stack
                stack.add(topOfStack);
                stack.add(currentInterval);
            }
        }
        int[][] output = new int[stack.size()][2];
        for (int i = output.length - 1; i >= 0; i--) {
            output[i] = stack.pop();
        }
        return output;
    }
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {15, 18}, {2, 6}};
        int[][] result = merge(arr);

        for (int[] interval : result) {
            System.out.print(Arrays.toString(interval) + " ");
        }
    }
}
//  Time Complexity of above program is: O(nlogn)
//  Space Complexity of above program is: O(n)