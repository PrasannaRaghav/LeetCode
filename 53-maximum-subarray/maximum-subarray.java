class Solution {
    public int maxSubArray(int[] nums) {
        int sum=nums[0];
        int temp=nums[0];
        for (int i=1;i<nums.length;i++) {
            // int temp=0;
            // for (int j=i;j<nums.length;j++) {
            //     temp=temp+nums[j];
            //     if(sum<temp){
            //         sum=temp;
            //     }
            // }
            if(temp+nums[i]>nums[i]) {
                temp=temp+nums[i];
            }
            else {
                temp=nums[i];
            }
            if(sum<temp){
               sum=temp;
            }
        }
        return sum;
    }
}