class Solution {
    int count;
    HashMap<Integer, HashSet<Integer>> m = new HashMap<>();
    public boolean leftAvailable(HashSet<Integer> set){
        for(int seat: set){
            if(seat==2 || seat==3 || seat==4 || seat==5) return false;
        }
        return true;
    }
    public boolean middleAvailable(HashSet<Integer> set){
        for(int seat: set){
            if(seat==4 || seat==5 || seat==6 || seat==7) return false;
        }
        return true;
    }
    public boolean rightAvailable(HashSet<Integer> set){
        for(int seat: set){
            if(seat==6 || seat==7 || seat==8 || seat==9) return false;
        }
        return true;
    }
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        count =2*n;
        for(int[] row: reservedSeats){
            m.putIfAbsent(row[0], new HashSet<>());
            m.get(row[0]).add(row[1]);
        }

        for(HashSet<Integer> set: m.values()){
            if(leftAvailable(set) && rightAvailable(set)){
                count=count;
            }else if(leftAvailable(set) || middleAvailable(set) || rightAvailable(set)){
                count--;
            }else{
                count-=2;
            }
        }
        return count;
    }
}