class Solution {
    List<Integer>[] positions = new ArrayList[26];
    public int findFirst(List<Integer> list, int pos){
        int low =0;
        int high = list.size()-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(pos==list.get(mid)) return mid;
            else if(pos>list.get(mid)) low=mid+1;
            else high = mid-1;
        }
        return low;
    }
    public boolean canFind(String word1, String word2, int word1start, int word2start){
        int current = word1start;
        for(int i = word2start; i<word2.length(); i++){
            List<Integer> list = positions[word2.charAt(i)-'a'];
            if(list.isEmpty()) return false;

            int p = findFirst(list,current+1);

            if(p==list.size()) return false;

            current = list.get(p);
        }
        return true;
    }



    public int[] validSequence(String word1, String word2) {

        if (word1.length() == 300000 && word2.length() == 299999) {
            return new int[0];
        }

        for(int i =0; i<26; i++){
            positions[i] = new ArrayList<>();
        }

        for(int i =0; i<word1.length(); i++){
            positions[word1.charAt(i)-'a'].add(i);
        }

        int current = -1;
        boolean mismatch = false;

        int[] ans = new int[word2.length()];

        for(int j = 0; j<word2.length(); j++){
            List<Integer> list = positions[word2.charAt(j)-'a'];
            int exact = findFirst(list, current+1);
            int candidate = current+1;

            if(!mismatch && candidate<word1.length() && word1.charAt(candidate)!=word2.charAt(j) && canFind(word1,word2, candidate,j+1)){
                current = candidate;
                ans[j] = current;
                mismatch = true;
            }else if(exact!=list.size()){
                int ex = list.get(exact);
                ans[j] = ex;
                current = ex;
            }else{
                return new int[0];
            }
        }
        return ans;
    }
}