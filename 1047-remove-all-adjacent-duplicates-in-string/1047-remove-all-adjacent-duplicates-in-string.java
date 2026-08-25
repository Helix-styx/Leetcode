class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!st.empty() && st.peek()==ch) st.pop();
            else st.push(ch);
        }
        while(!st.empty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}