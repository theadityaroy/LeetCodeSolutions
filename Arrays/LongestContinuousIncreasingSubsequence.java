// 674. Longest Continuous Increasing Subsequence

class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int count = 1;
        for(int i=1; i < nums.length; i++){
            if(nums[i-1] < nums[i]){
                count++;
            }
            else{
                res = Math.max(res, count);
                count = 1;
            }
        }
        if(count > res){
            return count;
        }
        return res;
    }
}

// Time Complexity : O(N)