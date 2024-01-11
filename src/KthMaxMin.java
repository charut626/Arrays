import java.util.*;
public class KthMaxMin {
    public static void main(String[] args) {
        int[] arr = {20,10,60,30,50,40};
        int k = 3;
        System.out.println(kthMax(arr,k));
        System.out.println(kthMin(arr,k));
    }
        static int kthMax( int[] arr, int k){
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int i = 0; i < k; i++) {
                pq.add(arr[i]);
            }
            for (int i = k; i < arr.length; i++) {
                if (pq.peek() < arr[i]) {
                    pq.poll();
                    pq.add(arr[i]);
                }
            }
            return pq.peek();
        }
    static int kthMin( int[] arr, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i = 0; i < k; i++) {
            pq.add(arr[i]);
        }
        for (int i = k; i < arr.length; i++) {
            if (pq.peek() > arr[i]) {
                pq.poll();
                pq.add(arr[i]);
            }
        }
        return pq.peek();
    }
    }
//    Time Complexity of above program: O(nlogk)