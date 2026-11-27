class Solution {
    public int arrangeCoins(int n) {
        int ans = 0;
        int i = 1;
        while(i>0){
            if(n>=i){
                n-=i;
                ans++;
                i++;
            }else break;
        }
        return ans;
    }
}