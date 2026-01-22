class Solution {
    public int fib(int n) {
        return fb(n);
    }
    static int fb(int n){
       if(n==0 || n==1){
            return n;
       }
        if(n<2){
            return n;
        }
        return fb(n-1) + fb(n-2);
    }
    
}