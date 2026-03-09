package in.developer.yash.dsa.binarysearch;

public class UpperBound {
	
// UpperBound condition ==>> arr[Index] > Target
	
	public int upperBound(int[] nums, int target) {
		int left = 0, right = nums.length-1, ans = -1;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(nums[mid] <= target) {
				left = mid + 1;
			}else {
				ans = mid;
				right = mid - 1;
			}
		}
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,2,2,6,7};
		UpperBound ub = new UpperBound();
		ub.upperBound(nums, 2);
	}

}
