class Solution {
    public static List<Integer> generateRow(int n){
        List<Integer> row = new ArrayList<>();
        int ans = 1;
        row.add(ans);
        for(int i =1; i<n; i++){
            ans = ans*(n-i);
            ans = ans/i;
            row.add(ans);
        }
        return row;
    }
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=1; i<=n; i++){  
            ans.add(generateRow(i));
        }
        return ans;
    }
}