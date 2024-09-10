/**
 * Given an array of integers nums sorted in non-decreasing order,
 * find the starting and ending position of a given target value.
 * If target is not found in the array, return [-1, -1].
 *
 * You must write an algorithm with O(log n) runtime complexity.
 * Example 1:
 *
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 * Example 2:
 *
 * Input: nums = [5,7,7,8,8,10], target = 6
 * Output: [-1,-1]
 * Example 3:
 *
 * Input: nums = [], target = 0
 * Output: [-1,-1]
 *
 */
package StriverAtoZSeries.BinarySearch;

public class FirstLastOccOfElement {

        static int searchLowerBound(int[] nums,int target) {
                int low = 0;
                int n = nums.length;
                int high=n-1;
                int first = -1;

                while(low<=high) {
                        int mid=(low+high)/2;
                        if(nums[mid] == target) {
                                first = mid;
                                high = mid-1;
                        } else if(nums[mid] < target) {
                                low = mid+1;
                        } else {
                                high = mid-1;
                        }
                }
                return first;
        }

        static int searchUpperBound(int[] nums, int target) {
                int low=0;
                int n = nums.length - 1;
                int high = n-1;
                int second = -1;

                while(low<=high) {
                        int mid = (low+high)/2;
                        if(nums[mid] == target) {
                                second = mid;
                                low = mid+1;
                        } else if(nums[mid] > target) {
                                high = mid - 1;
                        } else {
                                low = mid + 1;
                        }
                }
                return second;
        }

        static int[] searchInRange(int[] nums,int target) {
                int first = searchLowerBound(nums, target);
                if(first == -1) return new int[]{-1,-1};
                int second = searchUpperBound(nums, target);
                return new int[]{first,second};
        }
}
