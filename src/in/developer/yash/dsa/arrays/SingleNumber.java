package in.developer.yash.dsa.arrays;

import java.util.*;

public class SingleNumber {
	
	public int singleNumber(int[] nums) {
		int result = nums[0];
		for(int i = 1; i< nums.length; i++) {
			result = result^nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,5,6,7,1,4,5,6,7};
		SingleNumber sn  = new SingleNumber();
		int result = sn.singleNumber(nums);
		System.out.println(result);
	}

}
