class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int sum=0;
        int minlen=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++){
            sum +=nums[right];
            while(sum>=target){
                int len=right-left +1;
                if(minlen>len){
                    minlen=len;
                }
                sum -=nums[left];
                left++;
            }
        }

        return minlen == Integer.MAX_VALUE?0:minlen;
    }
}
