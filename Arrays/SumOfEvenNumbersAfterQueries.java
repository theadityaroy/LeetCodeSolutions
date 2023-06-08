// 985. Sum of Even Numbers After Queries:  https://leetcode.com/problems/sum-of-even-numbers-after-queries/

class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int sum = 0;
        int[] res = new int[nums.length];
        
        for (int num : nums) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        
        for (int i = 0; i < queries.length; i++) {
            int val = queries[i][0];
            int index = queries[i][1];
            
            if (nums[index] % 2 == 0) {
                sum -= nums[index];
            }
            
            nums[index] += val;
            
            if (nums[index] % 2 == 0) {
                sum += nums[index];
            }
            
            res[i] = sum;
        }
        return res;
    }
}

// Time Complexity : O(N + M)