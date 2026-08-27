class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];
        for(char ch: s.toCharArray()) freq[ch-'a']++;

        char[] ans = new char[n];

        for(int i = 0; i<n; i++){
            int idx = target.charAt(i)-'a';
            if(freq[idx]>0){
                ans[i] = target.charAt(i);
                freq[idx]--;
            }else{

                for(int y = idx+1; y<26; y++){
                    if(freq[y]>0){
                        ans[i] = (char)(y+'a');
                        freq[y]--;

                        int pos = i+1;

                        for(int z = 0; z<26; z++){
                            while(freq[z]>0){
                                ans[pos++] = (char)(z+'a');
                                freq[z]--;
                            }
                        }
                        return new String(ans);
                    }
                }

                for(int j=i-1; j>=0; j--){
                    freq[ans[j]-'a']++;
                    int targetIdx = target.charAt(j)-'a';

                    for(int c = targetIdx+1; c<26; c++){
                        if(freq[c]>0){
                            ans[j] = (char)(c+'a');
                            freq[c]--;

                            int pos = j+1;
                            for(int x = 0; x<26; x++){
                                while(freq[x]>0){
                                    ans[pos++]= (char)(x+'a');
                                    freq[x]--;
                                }
                            }
                            return new String(ans);
                        }
                    }
                }
                return "";
            }
        }
        for(int i = n-1; i>=0; i--){
            freq[ans[i]-'a']++;
            
            int idx = target.charAt(i)-'a';
            for(int j = idx+1; j<26; j++){
                if(freq[j]>0){
                    ans[i] = (char)(j+'a');
                    freq[j]--;

                    int pos = i+1;
                    for(int x =0; x<26; x++){
                        while(freq[x]>0){
                            ans[pos++]=(char)(x+'a');
                            freq[x]--;
                        }
                    }
                    return new String(ans);
                }
            }
        }
        return "";
    }
}