class NumArray {
    int[] s;
    public NumArray(int[] nums) {
        int n=nums.length;
        s=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum +=nums[i];
            s[i]=sum;
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return s[right];
        }
        return s[right]-s[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */