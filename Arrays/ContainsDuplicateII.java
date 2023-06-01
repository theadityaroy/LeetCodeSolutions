// 219. Contains Duplicate II : https://leetcode.com/problems/contains-duplicate-ii/

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i], i);
            }
            else{
                int pastIndex = map.get(nums[i]);
                if(Math.abs(pastIndex - i) <= k){
                    return true;
                }
                else{
                    map.put(nums[i], i);
                }
            }
        }
        return false;
    }
}

// Time Complexity : O(N)