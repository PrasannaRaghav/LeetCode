class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> ans=new HashMap<>();
        if(s.length()==1){
            return 0;
        }
        for(char c: s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        for(int i=0;i<s.length();i++){
            if(ans.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}