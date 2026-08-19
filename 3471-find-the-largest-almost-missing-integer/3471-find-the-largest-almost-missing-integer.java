class Solution {
    public int max(int[] arr){
        int max = arr[0];
        for(int i: arr){
            if(i>max) max = i;
        }
        return max;
    }
    public int largestInteger(int[] nums, int k) {
        int[] freq = new int[max(nums)+1];
        int ans = -1;
        for(int i=0; i<=nums.length-k; i++){
            HashSet<Integer> m = new HashSet<>();
            for(int j=i; j<i+k;j++){
                if(!m.contains(nums[j])){
                    m.add(nums[j]);
                    freq[nums[j]]++;
                }
            }
        }
        for(int i=freq.length-1; i>=0; i--){
            if(freq[i]==1) ans = Math.max(ans,i);
        }
        return ans;
    }
}