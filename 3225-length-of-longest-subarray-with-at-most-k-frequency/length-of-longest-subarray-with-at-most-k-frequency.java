class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int max=0;
        int left=0;
        HashMap<Integer,Integer> ans=new HashMap<>();
        for(int right=0;right<nums.length;right++){
            ans.put(nums[right],ans.getOrDefault(nums[right],0)+1);
            while(ans.get(nums[right])>k){
                ans.put(nums[left],ans.get(nums[left])-1);
                left++;
            }
            max=Math.max(max,right-left +1);
        }
        return max;
    }
}