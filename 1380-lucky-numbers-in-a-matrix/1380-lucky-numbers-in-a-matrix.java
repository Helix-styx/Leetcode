class Solution {
    public int minIndex(int[] arr){
        int min = 0;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[min]) min= i;
        }
        return min;
    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i<matrix.length; i++){
            int minIdx = minIndex(matrix[i]);
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<matrix.length; j++){
                if(matrix[j][minIdx]>max) max = matrix[j][minIdx];
            }
            if(matrix[i][minIdx]==max) ans.add(max);
        }
        return ans;
    }
}