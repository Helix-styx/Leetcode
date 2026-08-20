class Solution {
    public int max(int[] nums){
        int max = nums[0];
        for(int i =1; i<nums.length; i++){
            if(nums[i]>max) max = nums[i];
        }
        return max;
    }
    public int minOperations(int[] nums) {
        int steps = 0;
        int[] freq = new int[max(nums)+1];
        for(int i: nums){
            freq[i]++;
        }
        for(int i =0; i<freq.length; i++){
            if(freq[i]==1) return -1;
            if(freq[i]!=0 && freq[i]%3==0){
                steps+=freq[i]/3;
            }else if(freq[i]!=0 && freq[i]%3==2){
                steps++;
                freq[i]-=2;
                steps+=freq[i]/3;
            }else if(freq[i]!=0 && freq[i]%3==1){
                steps+=2;
                freq[i]-=4;
                steps+=freq[i]/3;
            }
        }
        return steps;
    }
}