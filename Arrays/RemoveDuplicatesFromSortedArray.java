// 26. Remove Duplicates from Sorted Array : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int res = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[res-1] != nums[i]){
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
}

// Time Complexity : O(N)