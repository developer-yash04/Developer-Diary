package in.developer.yash.dsa.binarysearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FirstLastOccurrence {
	
	public static int upperBound(int[] nums, int target) {
		int left = 0, right = nums.length -1, ans = nums.length; 
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(nums[mid] <= target) {
				left = mid + 1;
			}else {
				ans = mid;
				right = mid -1;
			}
		}
		return ans;
	}
	
	public static int lowerBound(int [] nums, int target) {
		int left = 0, right = nums.length -1, ans = nums.length;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(nums[mid] < target) {
				left = mid +1;
			}else {
				ans = mid;
				right = mid -1;
			}
		}
		return ans;
	}
	
	public int[] firstLastOccurrence(int[] nums, int target) {
		
		int lb = lowerBound(nums, target);
		int ub = upperBound(nums,target);
		
		if(nums[lb] != target || lb == nums.length ) {
			return new int[]{-1,-1};
		}
		
		return new int[] {lb, ub-1};
	}
	
	public static void main(String[] args) {
		
		int[] nums = {2,2,3,4,5,6};
		
		FirstLastOccurrence fo = new FirstLastOccurrence();
		int[] result = fo.firstLastOccurrence(nums, 2);
		
		System.out.println(Arrays.toString(result));
		
	}

}
