// 1018. Binary Prefix Divisible By 5 : https://leetcode.com/problems/binary-prefix-divisible-by-5/

class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> list = new ArrayList<>();
        int x = 0;
        for (int num : nums) {
            x = ((x << 1) + num) % 5;
            list.add(x == 0);
        }
        return list;
    }
}

// Time Complexity : O(N)