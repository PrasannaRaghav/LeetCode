class Solution {
    public List<String> printVertically(String s) {
       String[] st= s.split(" ");
       List<String> ans=new ArrayList<>();
        int len=0;
        for(int i=0;i<st.length;i++){
            if(st[i].length() >len){
                len=st[i].length();
            }
        }
        for (int j=0;j<len;j++) {
            StringBuilder sb = new StringBuilder();

            for (String word : st) {
                if (j < word.length()) {
                    sb.append(word.charAt(j));
                } else {
                    sb.append(" ");
                }
            }
            ans.add(rtrim(sb.toString()));
        }
         return ans;
    }
    private String rtrim(String str) {
        int end=str.length() -1;
        while (end>=0 && str.charAt(end)==' ') {
            end--;
        }
        return str.substring(0, end + 1);
    }
    
}