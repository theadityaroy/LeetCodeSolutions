// 169. Majority Element : https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        int res = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[res] == nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count == 0){
                count = 1;
                res = i;
            }
        }

        count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[res]){
                count++;
            }
        }

        if(count < nums.length/2){
            return 0;
        }
        return nums[res];
    }
}

// Time Complexity : O(N)