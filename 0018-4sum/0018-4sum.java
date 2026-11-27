import java.util.*;
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i = 0; i<n-3; i++){

            if(i>0 && nums[i]==nums[i-1]) continue;
            if((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) break;
            if((long)nums[i] + nums[n-1] + nums[n-2] + nums[n-3] < target) continue;

            for(int j = i+1; j<n-2; j++){

                if(j>i+1 && nums[j]==nums[j-1]) continue;
                if((long)nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) break;
                if((long)nums[i] + nums[j] + nums[n-1] + nums[n-2] < target) continue;
                
                int k = j+1;
                int l = n-1;
                while(k<l){
                    long sum = nums[i];
                    sum+= nums[j];
                    sum+= nums[k];
                    sum+= nums[l];
                    if(sum>target) l--;
                    else if(sum<target) k++;
                    else{
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                        ans.add(temp);
                        l--;
                        k++;
                        while(k<l && nums[k]==nums[k-1]) k++;
                        while(k<l && nums[l]==nums[l+1]) l--;
                    }
                }
            }
        }
        return ans;
    }
}