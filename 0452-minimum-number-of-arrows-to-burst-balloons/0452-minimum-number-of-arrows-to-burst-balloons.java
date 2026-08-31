class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,(a,b)->Integer.compare(a[1],b[1]));
        int i =0;
        int j = 1;
        int c = 1;
        while(j<points.length){
            if(points[i][1]<points[j][0]){
                c++;
                i=j;
            }
            j++;
        }
        return c;
    }
}