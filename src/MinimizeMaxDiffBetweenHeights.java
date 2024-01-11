import java.util.Arrays;

public class MinimizeMaxDiffBetweenHeights {
    static int minDifference(int[] arr,int k){
//        If there is only one element in array, it returns 0
        if(arr.length==1){
            return 0;
        }
//        Sort array in ascending order
        Arrays.sort(arr);
//        Initialize the min diff with max diff possible
        int diff=arr[arr.length-1]-arr[0];
        for(int i=1;i<arr.length;i++) {
            int max = Math.max(arr[i - 1] + k, arr[arr.length - 1] - k);
            int min = Math.min(arr[0]+k,arr[i]-k);
            diff=Math.min(diff,max-min);
        }
        return diff;
    }
    public static void main(String[] args) {
        int[]arr={3,6,12,13,15,18,21};
        int k=3;
        minDifference(arr,k);
        System.out.println(minDifference(arr,k));
    }
}
//  Time Complexity of the above program is: O(nlogn)