public class SubarraySumZero {
    static boolean hassubarraySumZero(int[] arr){
        for(int start=0;start<arr.length;start++){
            int sum=0;
            for(int end=start;end<arr.length;end++){
                sum+=arr[end];
                if(sum==0){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr={4,2,-3,1,6};
        boolean result = hassubarraySumZero(arr);
        if (result) {
            System.out.println("There is a subarray with sum 0.");  //2,-3,1 subarray whose sum is 0.
        } else {
            System.out.println("No subarray with sum 0 found.");
        }
    }
}
//  Time Complexity of above program is: O(n^2)