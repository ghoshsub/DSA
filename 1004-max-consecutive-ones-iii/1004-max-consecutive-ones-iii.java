class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0; 
        int maxLength=0; 
        int j=0;
        int zerocount=0;
        while(j<nums.length){
            if(nums[j] == 0){
                zerocount++;
            }
            while(zerocount>k){
                if(nums[i] == 0){
                    zerocount--;
                }
                i++;
            }
            maxLength=Math.max(maxLength, j-i+1);
            j++;
        }
        return maxLength;
    
  }
}