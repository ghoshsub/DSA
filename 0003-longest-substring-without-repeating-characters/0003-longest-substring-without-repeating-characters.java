class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0;
        int j=0;

        int hasharray[]= new int[256];
        int maxLength=0;
        while(j<s.length()){
            hasharray[s.charAt(j)]++;

            while(hasharray[s.charAt(j)] > 1){
                hasharray[s.charAt(i)]--;
                i++;
            }
        

            maxLength=Math.max(maxLength, j-i+1);
            j++;

        }
        return maxLength;
    }
}