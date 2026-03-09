package in.developer.yash.dsa.binarysearch;

public class LowerBound {
	
// LowerBound Condition ==>> arr[Index] >= Target.. 
	
	public int lowerBound(int[] nums, int target) {
		
		int left = 0, right = nums.length -1, ans = nums.length;
		
		while(left <= right) {
			int mid = left + (right - left)/2;
			
			if(nums[mid] == target) {
				ans = mid;
				right = mid -1;
			}else if(nums[mid] < target) {
				left = mid + 1;
			}else {
				right = mid -1;
			}
			
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,2,2,2,6,7};
		LowerBound lb = new LowerBound();
		int result = lb.lowerBound(nums, 2);
		System.out.println(result);
	}

}
