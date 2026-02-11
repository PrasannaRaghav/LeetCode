class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans =new HashMap<>();
        for(String s: strs){
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String sorted=new String(c);
            if(!ans.containsKey(sorted)){
                ans.put(sorted,new ArrayList());
            }
            ans.get(sorted).add(s);
        }
        return new ArrayList(ans.values());
    }
}