// 1089. Duplicate Zeros : https://leetcode.com/problems/duplicate-zeros/

class Solution {
    public void duplicateZeros(int[] arr) {
        int[] nums = new int[arr.length];
        int i = 0;
        int j = 0;
        while(i < arr.length && j < nums.length){
            if(arr[i] == 0){
                nums[j] = 0;
                if(j+1 < arr.length){
                    nums[j+1] = 0;
                }
                j += 2;
                i++;
            }
            else{
                nums[j] = arr[i];
                i++;
                j++;
            }
        }
        
        for(i = 0; i < arr.length; i++){
            arr[i] = nums[i];
        }
    }
}

// Time Complexity : O(N)