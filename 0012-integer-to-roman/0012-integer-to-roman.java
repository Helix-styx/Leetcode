class Solution {
    public String intToRoman(int num) {
        String[] symbol ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String ans ="";
        for(int i =0; i<13; i++){
            if(num<=0) return ans;
            while(num>=values[i]){
                ans+=symbol[i];
                num-=values[i];
            }
        }
        return ans;
    }
}