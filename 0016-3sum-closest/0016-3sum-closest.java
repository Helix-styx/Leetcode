class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int ans=0;
        int leastDiff = Integer.MAX_VALUE;
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j = i+1;
            int k = n-1;
            int sum = 0;
            while(j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==target) return sum;
                else if(sum>target){
                    if(Math.abs(target-sum)<leastDiff){
                        leastDiff = Math.abs(target-sum);
                        ans = sum;
                    }
                    k--;
                }else{
                    if(Math.abs(target-sum)<leastDiff){
                        leastDiff = Math.abs(target-sum);
                        ans = sum;
                    }
                    j++;
                }
            }
        }
        return ans;
    }
}