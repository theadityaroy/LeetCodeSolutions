// 888. Fair Candy Swap : https://leetcode.com/problems/fair-candy-swap/

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < aliceSizes.length; i++) {
            sum1 += aliceSizes[i];
        }
        for (int i = 0; i < bobSizes.length; i++) {
            sum2 += bobSizes[i];
        }
        int candy = (sum2 - sum1) / 2;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < bobSizes.length; i++) {
            set.add(bobSizes[i]);
        }
        int[] res = new int[2];
        for (int i = 0; i < aliceSizes.length; i++) {
            if (set.contains(aliceSizes[i] + candy)) {
                res[0] = aliceSizes[i];
                res[1] = aliceSizes[i] + candy;
            }
        }
        return res;
    }
}

// Time Complexity : O(N^2)
// Space Complexity : O(N)