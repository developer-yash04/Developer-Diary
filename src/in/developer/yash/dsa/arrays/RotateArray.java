package in.developer.yash.dsa.arrays;

import java.io.*;
import java.util.Arrays;

public class RotateArray {
	
	public void rev(int []nums, int left, int right) {
		
		
		
		while(left <= right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;
			left++;
			right--;
		}
		
//		System.out.println(Arrays.toString(nums));
		
	}
	
	public void rightRotate(int []nums2, int k) {
		
		int n = nums2.length;
		
		rev(nums2, n-k, n-1);
		rev(nums2, 0, n-k-1);
		rev(nums2, 0, n-1);
		
		System.out.println(Arrays.toString(nums2));
		
	}
	
	public void leftRotate(int []nums1, int k) {
		
		int n = nums1.length;
		
		rev(nums1, 0, k-1);
		rev(nums1, k, n-1);
		rev(nums1, 0, n-1);
		
		System.out.println(Arrays.toString(nums1));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RotateArray ra = new RotateArray();
		
		int []nums1 = {2,4,5,3,4,8,4};
		
//		ra.rev(nums, 0, nums.length-1);
		
		ra.leftRotate(nums1, 1);
		System.out.println();
		
		int []nums2 = {2,4,5,3,4,8,4};
		ra.rightRotate(nums2, 1);
		
		
		
	}

}
