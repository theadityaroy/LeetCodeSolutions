// 914. X of a Kind in a Deck of Cards : https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : deck) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int gcd = 0;
        for (int val : map.values()) {
            gcd = gcd(gcd, val);
        }

        return gcd > 1;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

// Time Complexity : O(N)