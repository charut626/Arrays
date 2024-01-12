public class MinJumpsToEnd {
    static int minJumpsToEnd(int[] arr) {
//        If array has only one element or no element,no jumps are needed
        if (arr.length <= 1) {
            return 0;
        }
//        Initialize variables
        int maxReach = arr[0];                //Maximum index that can be reached
        int steps = arr[0];                   //No. of steps remaining
        int jumps = 1;                   //Initialize jumps
//        Iterate through array
        for (int i = 1; i < arr.length; i++) {
//        Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);
//        Reduce one step, as we took one step forward
            steps--;
//         If no more steps are remaining,then
            if (steps == 0) {
                jumps++;
//         Check if last jump can reach end
                if (i >= maxReach) {
                    return -1;
                }
                steps = maxReach - i;
            }
        }
        return jumps;          //Impossible to reach end
    }
    public static void main(String[] args) {
        int[] arr={2,3,1,1,2,4,2,0,1,1};
        minJumpsToEnd(arr);
        System.out.println(minJumpsToEnd(arr));
    }
}
//Time Complexity of the above program is: O(n)