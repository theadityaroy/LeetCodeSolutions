// 724. Find Pivot Index : https://leetcode.com/problems/find-pivot-index/


class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        int leftSum = 0;
        int rightSum = 0;
        int i = 0;
        while(i < nums.length){
            rightSum = sum - leftSum - nums[i];
            if(leftSum == rightSum ){
                return i;
            }
            leftSum+=nums[i];
            i++;
        }
        return -1;
    }
}

// Time Complexity : O(N)