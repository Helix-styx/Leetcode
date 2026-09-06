class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        dp = new int[s.length()+1][t.length()+1];
        for(int[] row: dp) Arrays.fill(row,-1);
        return solve(s,t,0,0);
    }
    public int solve(String s, String t, int i, int j){
        if(dp[i][j]!=-1) return dp[i][j];
        if(j==t.length()) return dp[i][j]= 1;
        if(i==s.length()) return dp[i][j]= 0;

        int ways=0;
        if(s.charAt(i)==t.charAt(j)){
            ways = solve(s,t,i+1,j) + solve(s,t,i+1,j+1);
        }else{
            ways = solve(s,t,i+1,j);
        }
        return dp[i][j] = ways;
    }
}