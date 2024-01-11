class ReverseArray{
    static void Reverse(int[] arr){
//        Initialize start and end pointers
        int start=0;
        int end=arr.length-1;
//        Swap elements using two pointer approach until start meets end
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
//        Printing the reversed array
        System.out.println("The reversed array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
//        Call the method
        Reverse(arr);
    }
}
//   Time Complexity of above program: O(n)
//   Space Complexity of above program: O(n)