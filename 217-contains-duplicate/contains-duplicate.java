class Solution {
    public boolean containsDuplicate(int[] nums) {
       int n=nums.length;
       if(n<1){
        return false;
       }
       int sum=0;
       HashMap<Integer,Integer> ans=new HashMap<>();
       for(int num : nums){
            ans.put(num,ans.getOrDefault(num,0)+1);
            if(ans.get(num)>1){
                return true;
            }

       } 
       return false;
    }
}