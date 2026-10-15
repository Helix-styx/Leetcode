import java.util.*;
class Solution {
    public int longestConsecutive(int[] arr) {
        int n = arr.length;
        if (n==0) return 0;
        int longest = 1;
        Set<Integer> st = new HashSet<>();
        for(int i: arr){
            st.add(i);
        }
        int count = 0;
        for(int i : st){
            if(!st.contains(i-1)){
                count=1;
                int x = i;
                while(st.contains(x+1)){
                    x++;
                    count++;
                }
            }
            longest = Math.max(longest,count);
        }

        return longest;
    }
}