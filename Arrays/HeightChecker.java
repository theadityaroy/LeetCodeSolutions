// 1051. Height Checker : https://leetcode.com/problems/height-checker/

class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for(int i : heights){
            count[i]++;
        }

        int res = 0;
        int currHeight = 1;
        for(int i = 0; i < heights.length; i++){
            while(count[currHeight] == 0){
                currHeight++;
            }
            if(currHeight != heights[i]){
                res++;
            }
            count[currHeight]--;
        }
        return res;
    }
}

// Time Complexity : O(N)