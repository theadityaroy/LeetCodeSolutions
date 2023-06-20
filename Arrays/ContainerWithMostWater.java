// 11. Container With Most Water : https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int a = 0;
        int b = 0;
        int maxArea = 0;
        while(start < end){
            // Finding Length and Breadth :
            a = end - start;
            b = Math.min(height[start], height[end]);
            
            // Calculating Area :
            maxArea = Math.max(maxArea, a*b);

            // Setting Pointers :
            if(height[start] < height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxArea;
    }
}

// Time Complexity : O(N)