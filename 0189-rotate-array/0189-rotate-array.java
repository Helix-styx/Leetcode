class Solution {
    public void reverse(int[] arr, int s, int e){
        int left = s;
        int right = e;
        while(left<=right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        if(nums.length>1){
          reverse(nums, 0,nums.length-1);
            reverse(nums, 0,k-1);
            reverse(nums, k,nums.length-1);  
        }
        
    }
}