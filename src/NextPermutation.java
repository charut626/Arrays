public class NextPermutation {
    static void nextPermutation(int[] arr) {
//      Find the first decreasing element
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
//      Find the smallest element to the right of i and greater than arr[i]
        if (i >= 0) {
            int j = arr.length - 1;
            while (j >= 0 && arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
//      Reverse the subarray to the right of i
        reverse(arr, i + 1, arr.length- 1);
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        nextPermutation(arr);
        // Output the next permutation
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
//  Time Complexity of above program is: O(n)