package in.developer.yash.dsa.arrays;

import java.util.Arrays;

public class removeElement {
	
	public int removeElement(int[] nums, int val) {
		 int n = 0;
	        for(int i = 0; i< nums.length; i++){

	            if(nums[i] != val){
	                nums[n] = nums[i];
	                n++; 
	            }
	            
	        }
	        
	        return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []nums = {1,2,5,4,2};
		
		removeElement re = new removeElement();
		int r = re.removeElement(nums, 2);
		
		for(int i = 0; i < r; i++) {
			System.out.print(nums[i] + " ");
		
		}
		
		}
	}


