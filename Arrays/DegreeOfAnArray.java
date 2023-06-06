// 697. Degree of an Array : https://leetcode.com/problems/degree-of-an-array/

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> Left = new HashMap<>();
        Map<Integer, Integer> Right = new HashMap<>();
        Map<Integer, Integer> Count = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int x = nums[i];
            if(Left.get(x) == null){
                Left.put(x, i);
            }
            Right.put(x, i);
            Count.put(x, Count.getOrDefault(x, 0) + 1);
        }

        int ans = nums.length;
        int degree = Collections.max(Count.values());
        for(int i : Count.keySet()){
            if(Count.get(i) == degree){
                ans = Math.min(ans, (Right.get(i) - Left.get(i)) + 1);
            }
        }
        return ans;
    }
}

// Time Complexity: O(N)
// Space Complexity: O(N)