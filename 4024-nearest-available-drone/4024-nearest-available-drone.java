class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int ans = -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<drones.length; i++){
            int dis = Math.abs(drones[i][0]-target[0]) + Math.abs(drones[i][1]-target[1]);
            if(dis<=drones[i][2]){
                if(dis<min){
                    min = dis;
                    ans = i;
                }
            }
        }
        return ans;
    }
}