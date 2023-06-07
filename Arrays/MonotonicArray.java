// 896. Monotonic Array : https://leetcode.com/problems/monotonic-array/

class Solution {
    public boolean isMonotonic(int[] nums) {
        return increasing(nums) || decreasing(nums);
    }

    public boolean increasing(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] > nums[i]){
                return false;
            }
        }
        return true;
    }

    public boolean decreasing(int[] nums){
        for(int i = 1; i < nums.length; i++){
            if(nums[i-1] < nums[i]){
                return false;
            }
        }
        return true;
    }
}

// Time Complexity : O(N)