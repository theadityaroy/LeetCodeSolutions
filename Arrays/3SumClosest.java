// 16. 3Sum Closest : https://leetcode.com/problems/3sum-closest/

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sumClosest = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length - 2; i++){
            int low = i+1;
            int high = nums.length - 1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == target){
                    return sum;
                }
                if(Math.abs(sum - target) < Math.abs(sumClosest - target)){
                    sumClosest = sum;
                }
                else if(sum < target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return sumClosest;        
    }
}

// Time Complexity : O(N^2) and Sorting Complexity : O(N LogN)