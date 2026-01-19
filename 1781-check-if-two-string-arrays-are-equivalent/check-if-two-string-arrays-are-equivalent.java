class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = String.join("",word1);
        String s2 = String.join("",word2);
        boolean ans=s1.equals(s2);
        return ans;
    }
}