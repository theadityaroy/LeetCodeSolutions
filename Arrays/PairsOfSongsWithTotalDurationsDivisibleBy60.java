// 1010. Pairs of Songs With Total Durations Divisible by 60 : https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/

class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int i = 0; i < time.length; i++) {
            int rem = time[i] % 60;
            int complement = (60 - rem) % 60;
            count += map.getOrDefault(complement, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }

        return count;
    }
}

// Time Complexity : O(N)