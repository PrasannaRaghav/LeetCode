class Solution {
    public int thirdMax(int[] nums) {
        int large = nums[0];
        Integer second = null;
        Integer third = null;

    for(int i=1;i<nums.length;i++){
        if(nums[i]==large ||
           (second !=null && nums[i]==second) ||
           (third !=null && nums[i]==third)){
            continue;
        }

        if(nums[i]>large) {
            third =second;
            second =large;
            large =nums[i];
        }
        else if(second==null || nums[i]>second) {
            third =second;
            second =nums[i];
        }
        else if(third ==null || nums[i]>third) {
            third =nums[i];
        }
    }
    return third ==null ? large:third;
    }
}