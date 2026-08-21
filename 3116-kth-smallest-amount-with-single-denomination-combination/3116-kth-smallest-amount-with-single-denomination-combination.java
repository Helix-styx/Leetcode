class Solution {
    public int min(int[] arr){
        int min = arr[0];
        for(int i: arr){
            if(i<min) min = i;
        }
        return min;
    }
    public long gcd(long a, long b){
        while(a>0 && b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        return a==0? b:a;
    }
    public long lcm(long a,long b){
        return (a/gcd(a,b))*b;
    }
    public long count(int[] arr, long k){
        int n = arr.length;
        long multiples = 0;
        for(int mask = 1; mask< (1<<n); mask++){
            long currentLcm = 1;
            for(int i = 0; i<n; i++){
                if((mask & (1<<i))!=0){
                    if(currentLcm>k) break;
                    currentLcm = lcm(currentLcm,arr[i]);
                }
            }
            if(Integer.bitCount(mask)%2==1) multiples+=k/currentLcm;
            else multiples-=k/currentLcm;
        }
        return multiples;
    }
    public long findKthSmallest(int[] coins, int k) {
        long low =1;
        long high = (long)k*min(coins);
        while(low<high){
            long mid = low+(high-low)/2;
            long cnt = count(coins,mid);
            if(cnt>=k) high = mid;
            else low = mid+1;
        }
        return low;
    }
}