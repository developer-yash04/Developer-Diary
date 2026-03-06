package in.developer.yash.dsa.arrays;

import java.util.Arrays;

//The first approach is the brute force approach and the second approach is by using Hashmaps..

class Solution {

	public int[] twoSum( int[] nums, int target) {
        
        for(int i = 0; i< nums.length; i++) {
        	
        		for(int j = i+1; j < nums.length; j++) {
        			
        			if(nums[i] + nums[j] == target) { 
        				System.out.println("Target element" + " = " +target);
        				System.out.print(i + " = "+ nums[i] + "\n" +j+  " " +" = "+ nums[j]);
        				return new int[]{i,j};
        				
        			}
        			
        		}
        	
        }
        
        return new int[]{-1,-1};
        
    }        
}



public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2,1,4,5,8,3,7,9,2,0};
		int target = 9;
		Solution s = new Solution();
		s.twoSum(nums, target);
		
	}

}
