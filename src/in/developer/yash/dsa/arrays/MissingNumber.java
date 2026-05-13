package in.developer.yash.dsa.arrays;

public class MissingNumber {
	
	public int missingNumber(int nums[]) {
		int actualSum = 0;
        for(int i = 0; i< nums.length; i++){
            actualSum += nums[i];
        }

        // int start = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //     start = Math.min(start, nums[i]);
        // }

        int expectedSum = 0;
        for(int i = 1; i<= nums.length; i++){
            expectedSum += i;
        }

        int missingN =  expectedSum - actualSum ;
        return missingN;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumber mn = new MissingNumber();
		int []nums = {2,4,5,1,3};
		int result = mn.missingNumber(nums);
		System.out.println(result);
	}

}
