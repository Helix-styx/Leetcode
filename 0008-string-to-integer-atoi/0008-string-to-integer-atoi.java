class Solution {
    public int myAtoi(String s) {
        if(s.length()==0) return 0;
        int i =0;
        int n = s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i==n) return 0;
        int sign = 1;
        if(s.charAt(i)=='+') i++;
        else if(s.charAt(i)=='-'){
            i++;
            sign = -1;
        } 
        long res = 0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            res = res*10+digit;

            if(sign*res<=Integer.MIN_VALUE) return Integer.MIN_VALUE;
            else if(sign*res>=Integer.MAX_VALUE) return Integer.MAX_VALUE;

            i++;
        } 
        return (int)(res*sign);
    }
}