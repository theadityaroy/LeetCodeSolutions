// 905. Sort Array By Parity : https://leetcode.com/problems/sort-array-by-parity/

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int[] res = new int[nums.length];
        int start = 0;
        int end = res.length - 1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                res[start++] = nums[i];
            }
            else{
                res[end--] = nums[i];
            }
        }
        return res;
    }
}

// Time Complexity : O(N)