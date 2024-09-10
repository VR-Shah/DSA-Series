package StriverAtoZSeries.BinarySearch;

public class SearchInRotatedArray {
    static int searchInRotatedArray(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;
        int mid = (low + high) / 2;

        while (low <= high) {
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
