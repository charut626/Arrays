import java.math.BigInteger;

public class LargeFactorial {
    static BigInteger calculateFactorial(int n){
//        Initialize result to 0.
        BigInteger result=BigInteger.ONE;
        for(int i=1;i<=n;i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    public static void main(String[] args) {
        int n=25;
        System.out.println(calculateFactorial(n));
    }
}
//  Time Complexity of above program is: O(n)