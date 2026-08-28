class Solution {
    public int findNthDigit(int n) {
        if(n<10) return n;
        long digit = 1;
        long count = 9;
        long start = 1;
        while(n>digit*count){
            n-=digit*count;
            digit++;
            count*=10;
            start*=10;
        }
        long num = start+(n-1)/digit;

        long idx = (n-1)%digit;
        for(int i =0; i<digit-idx-1; i++){
            num/=10;
        }
        return (int)num%10;
    }
}