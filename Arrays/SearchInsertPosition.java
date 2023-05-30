// 35. Search Insert Position : https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0;
        int end = nums.length - 1;
        while(low <= end){
            int mid = (low + end)/2;
            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}

// Time Complexity : O(log N)
