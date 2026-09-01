class Solution {
    int[] dp;
    public int climbStairs(int n) {
        dp = new int[n+2];
        Arrays.fill(dp,-1);
        return solve(n+1);
    }
    public int solve(int n){
        if(dp[n]!=-1) return dp[n];
        if(n==0|| n==1) return dp[n]= n;
        return dp[n] = solve(n-1)+solve(n-2);
    }
}