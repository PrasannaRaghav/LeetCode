class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth=Integer.MIN_VALUE;
       for(int i=0;i<accounts.length;i++){
        int ans=0;
        for(int j=0;j<accounts[i].length;j++){
            ans+=accounts[i][j];
        }
        if(wealth<ans){
            wealth=ans;

        }
       } 
    return wealth;
    }
}