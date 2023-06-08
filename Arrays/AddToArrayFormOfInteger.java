// 989. Add to Array-Form of Integer : https://leetcode.com/problems/add-to-array-form-of-integer/

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int n = num.length;
        int carry = 0;
        List<Integer> result = new ArrayList<>();
        int i = n - 1;
        while (i >= 0 || k > 0 || carry > 0) {
            int digit = carry;
            if (i >= 0) {
                digit += num[i];
                i--;
            }
            if (k > 0) {
                digit += k % 10;
                k /= 10;
            }
            result.add(0, digit % 10);
            carry = digit / 10;
        }
        return result;
    }
}

// Time Complexity :  O(max(n, log(k)))