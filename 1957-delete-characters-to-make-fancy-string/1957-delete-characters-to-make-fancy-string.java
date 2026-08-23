class Solution {
    public String makeFancyString(String s) {
        int count =0;
        StringBuilder ans = new StringBuilder();
        char last =' ';
        for(int i =0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=last){
                count=1;
                ans.append(ch);     
            } 
            else{
                count++;
                if(count<3) ans.append(ch);
            }
            last = ch;
        }
        return ans.toString();
    }
}