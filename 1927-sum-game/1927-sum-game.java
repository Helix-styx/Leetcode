class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int leftQuestion = 0;
        int rightQuestion = 0;
        int leftSum = 0;
        int rightSum = 0;

        for(int i =0; i<n/2; i++){
            char ch = num.charAt(i);
            if(Character.isDigit(ch)) leftSum+=ch-'0';
            else if(ch=='?') leftQuestion++;
        }

        for(int i =n/2; i<n; i++){
            char ch = num.charAt(i);
            if(Character.isDigit(ch)) rightSum+=ch-'0';
            else if(ch=='?') rightQuestion++;
        }

        int totalQ = leftQuestion+rightQuestion;
        if((totalQ & 1)==1) return true;
        else {
            int diff = (leftSum-rightSum) + 9*((leftQuestion-rightQuestion)/2);
            return diff!=0;
        }

    }
}