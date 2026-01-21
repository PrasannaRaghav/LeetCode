class Solution {
    public int search(int[] nums, int target) {
        int srt=0;
        int end=nums.length-1;
        return bs(nums,target,srt,end);
    }
        static int bs(int[] nums,int target,int srt,int end){
            if(srt>end){
                return -1;
            }
            int mid=srt+(end-srt)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                return bs(nums,target,srt,mid-1);
            }
            return bs(nums,target,mid+1,end);
        }
    
}