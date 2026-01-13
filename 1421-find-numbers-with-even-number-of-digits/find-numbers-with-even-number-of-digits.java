class Solution {
    public int findNumbers(int[] nums) {
        int total = 0;

        for (int i = 0; i < nums.length; i++) {

          int  totalDigits = countDigits(nums[i]);
          if(totalDigits%2==0){
            total +=1;
          }
        }    
    return total;
    }

    
    static int countDigits(int num) {
        if (num == 0) return 1;
        if(num<0){
          num=num*-1;
        }   
        int count = 0;

        while (num > 0) {
            
            num = num / 10;
            count++;
        }
       
        return count;
    }
}