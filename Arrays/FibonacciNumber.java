// 509. Fibonacci Number : https://leetcode.com/problems/fibonacci-number/

class Solution {
    public int fib(int n) {
        if(n<=1)
            return n;
        int a = 0, b = 1, c;
        while(n-->=1){
            c=a+b;
            a=b;
            b=c;
        }
        return a;
    }
}

// Time Complexity : O(N)