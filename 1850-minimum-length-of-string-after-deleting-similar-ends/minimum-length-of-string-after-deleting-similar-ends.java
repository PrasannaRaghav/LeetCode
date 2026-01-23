class Solution {
    public int minimumLength(String s) {
        int srt=0;
        int end=s.length() -1;
        // int ans =0;
        // while(srt<end){
        //     if(s.charAt(srt)==s.charAt(srt+1)){
        //         srt +=1;
        //         while(srt<end){
        //             if(s.charAt(srt)==s.charAt(srt+1)){
        //                 srt=+1;
        //             }
        //         }
        //     }
        //     if(s.charAt(end)==s.charAt(end+1)){
        //         end -=1;
        //         while(srt<end){
        //             if(s.charAt(end)==s.charAt(end-1)){
        //                 end -=1;
        //             }
        //         }
        //     }
        //     if(s.charAt(srt)==s.charAt(end)){
        //         srt +=1;
        //         end -=1;
        //     }
        //     ans =end-srt +1;
        // return ans;
        //}
        while (srt< end && s.charAt(srt)==s.charAt(end)) {
            char ch=s.charAt(srt);
            while (srt<= end && s.charAt(srt)==ch) {
                srt++;
            }
            while (srt<= end && s.charAt(end)==ch) {
                end--;
            }
        }
        
        return end-srt +1;
    }
}