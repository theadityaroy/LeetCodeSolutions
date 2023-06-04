// 628. Maximum Product of Three Numbers : https://leetcode.com/problems/maximum-product-of-three-numbers/

class Solution {
    public int maximumProduct(int[] nums) {
        // 2 MIN VALUES :
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        // 3 MAX VALUES :
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;

        for(int n : nums){
            // MINIMUM ELEMENTS :
            if(n <= min1){
                min2 = min1;
                min1 = n;
            }
            else if(n <= min2){
                min2 = n;
            }
            // MAXIMUM ELEMENTS :
            if(n >= max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(n >= max2){
                max3 = max2;
                max2 = n;
            }
            else if(n >= max3){
                max3 = n;
            }
        }
        // RETURN MAX PRODUCT OF THREE ELEMENTS :
        return Math.max(min1*min2*max1, max1*max2*max3);
    }
}

// Time Complexity : O(N)