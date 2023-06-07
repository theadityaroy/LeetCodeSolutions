// 922. Sort Array By Parity II : https://leetcode.com/problems/sort-array-by-parity-ii/

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == 0){
                res[start] = nums[i];
                start += 2;
            }
            else{
                res[end] = nums[i];
                end += 2;
            }
        }
        return res;
    }
}

// Time Complexity : O(N)