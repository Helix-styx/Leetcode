class Solution {
    public int longestSubsequence(int[] nums) {
        int count =0;
        int xor=0;
        for(int i: nums){
            xor = xor^i;
            if(i!=0) count++;
        }
        if(xor!=0) return nums.length;
        else{
            if(count!=0) return nums.length-1;
            else return 0;
        }
    }
}