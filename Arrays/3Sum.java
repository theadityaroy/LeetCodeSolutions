// 15. 3Sum : https://leetcode.com/problems/3sum/

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < nums.length-2; i++){
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){
                int low = i + 1;
                int high = nums.length - 1;
                int target = 0 - nums[i];
                while(low < high){
                    if(nums[low] + nums[high] == target){
                        res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                        while(low < high && nums[low] == nums[low+1]){
                            low++;
                        }
                        while(low < high && nums[high] == nums[low-1]){
                            high--;
                        }
                        low++;
                        high--;
                    }
                    else if(target > nums[low] + nums[high]){
                        low++;
                    }
                    else{
                        high--;
                    }
                }
            }
        }
        return res;
    }
}

// Time Complexity : O(N^2) and Sorting Complexity : O(N LogN)