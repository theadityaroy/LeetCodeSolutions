// 414. Third Maximum Number : https://leetcode.com/problems/third-maximum-number/

class Solution {
    public int thirdMax(int[] nums) {
        int max1 = nums[0];
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > max1){
                max3 = max2;
                max2 = max1;
                max1 = nums[i];
            }
            else if(nums[i] > max2 && nums[i] < max1){
                max3 = max2;
                max2 = nums[i];
            }
            else if(nums[i] > max3 && nums[i] < max2){
                max3 = nums[i];
            }
        }
        if (max3 == Long.MIN_VALUE) {
            int ans = (int) max1;
            return ans;
        }
        
        int ans = (int) max3;
        return ans;
    }
}

// Time Complexity : O(N)