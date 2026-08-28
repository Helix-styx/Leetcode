class Solution {
    public int binary(int[] row){
        int n = row.length;
        int left = 0;
        int right = n-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(row[mid]<0) right = mid-1;
            else left = mid+1;
        }
        return n-right-1;
    }
    public int countNegatives(int[][] grid) {
        int sum = 0;
        for(int[] row: grid){
            sum+=binary(row);
        }
        return sum;
    }
}