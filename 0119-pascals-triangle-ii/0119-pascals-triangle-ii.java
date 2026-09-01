class Solution {
    public List<Integer> getRow(int n) {
        n+=1;
        List<Integer> row = new ArrayList<>();
        long ans = 1;
        row.add((int)ans);
        for(int i =1; i<n; i++){
            ans = ans*(n-i);
            ans = ans/i;
            row.add((int)ans);
        }
        return row;
    }
}