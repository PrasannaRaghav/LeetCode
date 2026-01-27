class Solution {
    public void reverseString(char[] s) {
        int srt=0;
        int end=s.length -1;
        while(srt<end){
            char temp=s[srt];
            s[srt++]=s[end];
            s[end--]=temp;    
        }
    }
}