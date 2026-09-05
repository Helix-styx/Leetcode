class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        
        int[] maxR = new int[n];
        int[] minR = new int[n];

        int max = nums[0];
        int min = nums[n-1];
        for(int i =0; i<n; i++){
            if(nums[i]>max){
                max = nums[i];
            } 
            maxR[i]= max;
            if(nums[n-i-1]<min){
                min = nums[n-i-1];
            }
            minR[n-i-1] = min;  
        }
        for(int i =0; i<n; i++){
            if(maxR[i]-minR[i]<=k) return i;
        }
        return -1;
    }
}