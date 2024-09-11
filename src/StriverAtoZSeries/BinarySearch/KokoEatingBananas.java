package StriverAtoZSeries.BinarySearch;

public class KokoEatingBananas {
    static int minimumKokoEating(int[] piles, int h) {
        int low = 0, high = findMaxValue(piles);

        while(low<=high) {
            int mid = (low+high)/2;
            int totalHour = getHourlyTimeCalc(piles,mid);

            if(totalHour<=h) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
     }

     static int findMaxValue(int[] piles) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++) {
            max = Math.max(max,piles[i]);
        }
        return max;
     }

     static int getHourlyTimeCalc(int[] piles,int value) {
        int maxValue = findMaxValue(piles);
        int ceilvalue = 0;

        for(int i=0;i<piles.length;i++) {
                ceilvalue+=Math.ceil((double)piles[i]/(double)value);
        }
        return ceilvalue;
     }
}
