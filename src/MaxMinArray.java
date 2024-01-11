class MaxMinArray{
    public static void main(String[] args) {
        int[] arr={3,1,8,5,2,7,4,6};
//        Initialize max and min
        int max=arr[0];
        int min=arr[0];
//        Iterate through array to find max and min
        for(int i=0;i< arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            } else if (arr[i]<min) {
                min=arr[i];
            }
        }
//        Print output
        System.out.println("The maximum elements in array is:" + max);
        System.out.println("The minimum elements in array is:" + min);
    }
}
//  Time Complexity of above program: O(n)
//  Space Complexity of above program: O(1)