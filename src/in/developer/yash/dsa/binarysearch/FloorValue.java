package in.developer.yash.dsa.binarysearch;

public class FloorValue {
	
	public int floorValue(int []nums, int target) {
		
		int left =0, right = nums.length -1;
		int ans = -1;
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(nums[mid] == target) {
				return nums[mid];
			}else if(nums[mid] > target) {
				ans = nums[mid];
				right = mid -1;
			}else {
				left = mid +1;
			}
		}
		
		//System.out.print("The Floor-Value of the Target element is: " + left);
		return right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FloorValue f = new FloorValue();
		int [] nums = {1,1,2,2,3,4,4,5};
		int result = f.floorValue(nums, 4);
		System.out.println(result);
	}

}
