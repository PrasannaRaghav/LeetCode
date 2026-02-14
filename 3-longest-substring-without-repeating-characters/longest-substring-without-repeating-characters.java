class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> ans=new HashSet<>();
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            while(ans.contains(s.charAt(right))){
                ans.remove(s.charAt(left));
                left++;
            }
            ans.add(s.charAt(right));
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}