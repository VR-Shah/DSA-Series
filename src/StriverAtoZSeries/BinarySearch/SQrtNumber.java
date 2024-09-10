package StriverAtoZSeries.BinarySearch;
import java.util.*;

public class SQrtNumber {
    static int findSqrt(int n) {
        int low=1,high=n;
        int ans = 0;

        while(low<=high) {
            int mid=(low+high)/2;
            if(mid*mid == n) {
               ans = mid;
            } else if(mid*mid < n) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(findSqrt(n));
    }
}
