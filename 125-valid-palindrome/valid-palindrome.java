class Solution {
    public boolean isPalindrome(String s) {
         s=s.toLowerCase();
        String remove="";
        for (int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if ((c>='a'&&c<='z')||(c>='0'&&c<='9')) {
                remove +=c;   
            }
        }
        String reversed="";
        for (int i=remove.length()-1;i>=0;i--) {
            reversed +=remove.charAt(i);
        }
        return remove.equals(reversed);
    } 
}