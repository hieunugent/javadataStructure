class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1="";
        String w2="";
        int len1 = word1.length;
        int len2 = word2.length;
        for(int i = 0 ; i < len1; i++){
            w1 =w1.concat(word1[i]);
        }
      
        for(int i = 0 ; i < len2; i++){
            w2 = w2.concat(word2[i]);
        }
        if (w1.length() != w2.length()){
                return false;
            }
        int l =0;
       
        for(; l < w1.length();l++){
            if(w1.charAt(l) != w2.charAt(l)){
                return false;
            }
        }
           return true;
    }
    
    
    
}