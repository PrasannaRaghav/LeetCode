class Solution {
    public boolean checkIfPangram(String sentence) {
        HashSet<Character> ans=new HashSet<>();
        for(int i=0;i<sentence.length();i++){
            ans.add(sentence.charAt(i));
        }
        return ans.size()==26;
    }
}