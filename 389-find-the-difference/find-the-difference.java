class Solution {
    public char findTheDifference(String s, String t) {
        // int n=s.length();
        // StringBuilder m=new StringBuilder(t);
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<m.length();j++){
        //         if(s.charAt(i)==m.charAt(j)){
        //             m.deleteCharAt(j);
        //             break;
        //         }
               
        //     }
        // }
        // return m.charAt(0);

        HashMap<Character,Integer> ans=new HashMap<>();
        for(char c : s.toCharArray()){
            ans.put(c,ans.getOrDefault(c,0)+1);
        }
        for(char b :t.toCharArray()){
            if(ans.containsKey(b) && ans.get(b)>0){
                ans.put(b,ans.get(b)-1);
            }
            else{
                return b;
            }
        }
        return '\0';
    }
}