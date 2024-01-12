public class Duplicate {
    static int duplicate(int[] arr){
        for(int i=0;i<arr.length;i++){
            int index=Math.abs(arr[i]);
            if(arr[index]<0){
                return index;
            }
            arr[index]=-arr[index];
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        System.out.println(duplicate(arr));
    }
}
//  Time Complexity of above program is: O(n)