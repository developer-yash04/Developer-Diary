package in.developer.yash.dsa.arrays;

import java.util.Arrays;

public class RearrangeElements {
	
	public int[] rearrangeArray(int[] nums) {
        int evenIndex = 0, oddIndex = 1;
        int[] arr = new int[nums.length];
        
        for(int i = 0; i<nums.length; i++){

            if(nums[i]>0){
                arr[evenIndex] = nums[i];
                evenIndex += 2;
            }else if(nums[i]<0){
                arr[oddIndex] = nums[i];
                oddIndex += 2;
            }

        }
        return arr;
    }	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeElements re = new RearrangeElements();
		int []nums = {2,4,5,7,-1,-2,-3,-4};
		int[] result = re.rearrangeArray(nums);
		System.out.print(Arrays.toString(result));
	}

}
