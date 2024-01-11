public class CyclicRotateArray {
    static void cyclicallyRotateArray(int[] arr) {
//        Store the last element in a variable.
        int lastElement = arr[arr.length - 1];
//        Shift element to right from second to last position
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
//        Place last element at first position
        arr[0] = lastElement;
        for(int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        cyclicallyRotateArray(arr);
    }
}
//  Time Complexity of above program: O(n)