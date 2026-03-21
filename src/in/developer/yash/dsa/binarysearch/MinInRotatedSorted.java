package in.developer.yash.dsa.binarysearch;

public class MinInRotatedSorted {
	
	public int minInRotatedSorted(int []nums) {
		int left = 0, right = nums.length - 1;
        int ans = Integer.MAX_VALUE;

        while(left <= right){
            int mid = (left + right)/2;
            
            if(nums[left] <= nums[mid]){
                ans = Integer.min(ans, nums[left]);
                left = mid + 1;
            }else{
                ans = Integer.min(ans, nums[mid]);
                right = mid -1;
            }
        }
        return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinInRotatedSorted mn = new MinInRotatedSorted();
		int []nums = {5,-1,0,1,2,3,4};
		int result = mn.minInRotatedSorted(nums);
		System.out.println(result);
	}

}
