class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five =0;
        int ten =0;
        for(int i: bills){
            int change = i-5;
            if(change==0) five++;
            else if(change==5){
                if(five>0) five--;
                else return false;
                ten++;
            }else{
                if(ten>0 && five>0){
                    ten--;
                    five--;
                }else if(five>2){
                    five-=3;
                }else return false;
            }
        }
        return true;
    }
}