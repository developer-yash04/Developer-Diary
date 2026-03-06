package in.developer.yash.dsa.arrays;

import java.util.*;

public class LeadersInArray {
//Loop from right and store it in the Growable array(ArrayList)
	public void LeadersArray(int[] nums) {
		
		int big = nums[nums.length -1];
		ArrayList leader = new ArrayList();
		leader.add(big);
		
		for(int i = nums.length - 2; i >= 0; i--) {
			
			if(nums[i] > big) {
				big = nums[i];
				leader.add(big);
			}
			
		}
		Collections.reverse(leader);
		
		System.out.println(leader);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LeadersInArray l = new LeadersInArray();
		
		int []nums = {10,22,12,3,0,6};
		l.LeadersArray(nums);
		
	}

}
