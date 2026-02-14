class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> ans=new HashMap<>();
        for(char c:magazine.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        for(char c:ransomNote.toCharArray()){
           if(ans.containsKey(c)&& ans.get(c)>0){
            ans.put(c,ans.get(c)-1);
           }
           else{
            return false;
           }
        }
        return true;
    }
}