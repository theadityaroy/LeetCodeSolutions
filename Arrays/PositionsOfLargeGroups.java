// 830. Positions of Large Groups : https://leetcode.com/problems/positions-of-large-groups/

lass Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int i = 0;
        for(int j = 1; j <= s.length(); j++){
            if( j == s.length() || s.charAt(j-1) != s.charAt(j)){
                if(j-i >= 3){
                    res.add(Arrays.asList(new Integer[]{i, j-1}));
                }
                i = j;
            }
        }
        return res;
    }
}

// Time Complexity : O(N)