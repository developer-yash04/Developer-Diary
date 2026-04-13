package in.developer.yash.dsa.arrays;

import java.util.*;

public class ThreeSum {
	
	public List<List<Integer>> threeSum(int[] nums) {
        int pivot = 0;
        List<List<Integer>> al = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i< nums.length - 2; i++){
           int j = i+1;
           int k = nums.length - 1;

            if(i > 0 && nums[i] == nums[i - 1]){
                continue;
            }

            while(j < k){
                if(nums[j] + nums[k] == -nums[i]){
                    al.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[j] == nums[j-1]) j++;
                    while(j < k && nums[k] == nums[k+1]) k--;

                }else if(nums[j] + nums[k] > -nums[i]){
                    k--;
                }else{
                    j++;
                }
            }
            
        }
        return al;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,4,5,7,8,3,2,6,0};
		ThreeSum ts = new ThreeSum();
		System.out.println(ts.threeSum(nums));
	}

}
