class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
       List<Integer> target1=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        target1.add(index[i],nums[i]);
       } 
       int[] target=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        target[i]=target1.get(i);
       } 
       return target;
    }
}