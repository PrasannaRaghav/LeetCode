class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> emp=new HashSet<>();
        HashSet<Integer> ans=new HashSet<>();
        for(int num: nums1){
            emp.add(num);
        }
        for(int num: nums2){
            if(emp.contains(num)){
                ans.add(num);
            }
        }
        int[] answer=new int[ans.size()];
        int i=0;
        for(int num: ans){
            answer[i]=num;
            i++;
        }
        
    return answer;
    }
}