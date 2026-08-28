class Solution {
    public int mySqrt(int n) {
        if(n==1) return 1;
        long l = 1;
        long r = (long)n/2;
        while(l<=r){
            long mid = l+(r-l)/2;
            if(mid*mid==n) return (int)mid;
            else if(mid*mid>n) r=mid-1;
            else l = mid+1;
        }
        return (int)r;
    }
}