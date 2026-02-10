class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> ans=new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(char c: s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        for(char c: t.toCharArray()){
            if(!ans.containsKey(c)){
                return false;
            }
            ans.put(c,ans.get(c)-1);
            if(ans.get(c)==0){
                ans.remove(c);
            }
        }
        return ans.isEmpty();

    }
}