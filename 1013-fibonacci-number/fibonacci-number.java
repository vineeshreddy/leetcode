class Solution {
    public int fib(int n) {
        // tabulation
        // iterative approach
        if(n <= 1) {
            return n;
        }
        int prev1 = 1;
        int prev2 = 0;
        int res = 0;
        for(int i=2; i<=n; i++) {
            res = prev1 + prev2;
            prev2 = prev1;
            prev1 = res;
        }
        return res;
    }
}