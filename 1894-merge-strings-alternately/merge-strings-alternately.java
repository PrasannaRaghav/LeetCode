class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();
        StringBuilder sb = new StringBuilder();
        int s=0;
        while(s<len1 || s<len2) {
            if(s<len1){
            sb.append(word1.charAt(s));
            }
            if(s<len2) {
                sb.append(word2.charAt(s));
            }
        s++;
        }
        return sb.toString();
    }
}