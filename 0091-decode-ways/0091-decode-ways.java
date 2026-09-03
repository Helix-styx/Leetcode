class Solution {
    int[] dp;
    public int func(String s, int i){
        if(dp[i]!=-1) return dp[i];
        if(i>=s.length()) return 1;
        if(s.charAt(i)=='0') return 0;

        int ways = func(s,i+1);

        int digit =0;
        if(i+1<s.length())
        digit = Integer.parseInt(s.substring(i,i+2));

        if(digit>=10 && digit<=26) ways+=func(s,i+2);

        return dp[i]=ways;
    }
    public int numDecodings(String s) {
        dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
        return func(s,0);
    }
}