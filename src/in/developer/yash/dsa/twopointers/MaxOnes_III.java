package in.developer.yash.dsa.twopointers;

public class MaxOnes_III {
	public int longestOnes(int[] nums, int k) {
        int i = 0;
        int countZero = 0, maxlen = 0;
        
        for(int j = 0; j< nums.length; j++){
            if(nums[j] == 0){ 
                countZero++;
            }

            if(countZero > k){
                if(nums[i] == 0){
                    countZero--;
                }
                i++;
            }

            maxlen = Math.max(maxlen, j-i+1);
        }

    return maxlen;
    }
}
