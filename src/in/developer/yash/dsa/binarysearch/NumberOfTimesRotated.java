package in.developer.yash.dsa.binarysearch;

public class NumberOfTimesRotated {
	// 5 6 0 1 2 3 4
	public int numberOfTimesRotated(int []nums) {
		int left = 0, right = nums.length -1 , ans = -1;
		
		if(nums[left] <= nums[right]) {return 0;}
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			if(nums[mid] <= nums[right]) {
				right = mid - 1;
			}else {
				left = mid + 1;
			}
		}
		return left;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOfTimesRotated n = new NumberOfTimesRotated();
		int []nums = {5,6,0,1,2,3,4};
		int result = n.numberOfTimesRotated(nums);
		System.out.println(result);
	}

}
