class Solution {
    public int maxArea(int[] height) {
     int left=0;
     int right=height.length-1;
     int height1=0;
     int breadth=0;
     int ans=0;
     while(left<right){
        height1=Math.min(height[left],height[right]);
        breadth=right-left;
        ans=Math.max(ans,height1*breadth);
        if(height[left]<height[right])left++;
        else right--;
     }   
     return ans;
    }
}