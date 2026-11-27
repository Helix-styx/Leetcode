class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int taken = -1;
        for(int i  = 0; i<g.length; i++){
           int j = taken==-1?0:taken+1;
            while(j<s.length && taken<s.length-1){
                if(s[j]>=g[i]){
                    taken = j;
                    count++;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}