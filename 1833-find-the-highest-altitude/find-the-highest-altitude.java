class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length+1;
        int[] alt=new int[n];
        alt[0]=0;
       // int temp=0;
        for(int i=1;i<n;i++){
         
            alt[i]=alt[i-1]+gain[i-1];
           // temp++;
        }
        int highest=alt[0];
        for(int i=1;i<n;i++){
            if(highest<alt[i]){
                highest=alt[i];
            }
        }
    return highest;
    }
}