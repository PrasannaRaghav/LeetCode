class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> sub = new HashMap<>();
        sub.put(0, 1);
        int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum +=nums[i];
            if(sub.containsKey(sum-k)){
            count +=sub.get(sum - k);
            }
            sub.put(sum,sub.getOrDefault(sum,0)+1);
        }
        return count;
    }
}