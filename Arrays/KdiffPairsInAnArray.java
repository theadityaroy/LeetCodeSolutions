// 532. K-diff Pairs in an Array : https://leetcode.com/problems/k-diff-pairs-in-an-array/

class Solution {
    public int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int res = 0;
        for(int i : map.keySet()){
            if(k>0 && map.containsKey(k+i) || k==0 && map.get(i) > 1){
                res++;
            }
        }
        return res;
    }
}

// Time Complexity : O(N)