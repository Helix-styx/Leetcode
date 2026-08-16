class Solution {
    int[][] dp;
    int[] suffix;
    public int stoneGameII(int[] piles) {
        int n = piles.length;
        dp = new int[n][n+1];
        suffix = new int[n+1];
        for(int[] i: dp) Arrays.fill(i,Integer.MIN_VALUE);
        for(int i=n-1; i>=0; i--) suffix[i]=suffix[i+1]+piles[i];

        return solve(piles, 0, 1);
    }

    public int solve(int[] piles, int i, int m){
        int n = piles.length;
        if(i>=n) return 0;
        if(dp[i][m]!=Integer.MIN_VALUE) return dp[i][m];

        int ans = Integer.MIN_VALUE;
        for(int k =1; k<=2*m && i+k<=n; k++){
            ans = Math.max(ans, suffix[i]-solve(piles,i+k,Math.max(k,m)));
        }
        return dp[i][m] = ans;
    }
}