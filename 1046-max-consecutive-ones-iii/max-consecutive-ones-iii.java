class Solution {
    public int longestOnes(int[] nums, int k) {
        int count=0,count1=0;
        int max=0;
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0){
                count++;
            }
            
            if(count>k){
                if(nums[left]==0){
                count--;
                }
                left++;  
            }
            if(count<=k){
                max=Math.max(right-left+1,max);
            }
            
            
        }
        return max;
    }
}