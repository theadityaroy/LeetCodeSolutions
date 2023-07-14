// 31. Next Permutation : https://leetcode.com/problems/next-permutation/

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        for(int i = n-2; i>=0; i--){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(nums, 0, n-1);
        }
        else{
            for(int i = n-1; i>=0; i--){
                if(nums[idx] < nums[i]){
                    int temp = nums[idx];
                    nums[idx] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            reverse(nums, idx+1, n-1);
        }
    }

    private void reverse(int[] nums, int low, int high){
        while(low < high){
            int temp = nums[low];
            nums[low] = nums[high];
            nums[high] = temp;
            low++;
            high--;
        }
    }
}

// Time Complexity : O(N)