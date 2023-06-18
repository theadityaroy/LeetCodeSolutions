// 1128. Number of Equivalent Domino Pairs : https://leetcode.com/problems/number-of-equivalent-domino-pairs/

class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int pairs = 0;
        for(int[] d : dominoes){
            int i = d[0] < d[1] ? d[0] : d[1];
            int j = d[0] < d[1] ? d[1] : d[0];
            pairs += counts[i*10 + j]++;
        }
        return pairs;
    }
}

// Time Complexity : O(N)