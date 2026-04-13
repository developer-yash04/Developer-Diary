package in.developer.yash.dsa.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
	
public List<List<Integer>> fourSum(int[] nums, int target) {
        
        List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(nums);

        for(int a = 0; a< nums.length-3; a++){
            if(a > 0 && nums[a] == nums[a-1]){
                continue;
            }
            for(int b = a+1; b< nums.length-2; b++){
                int c = b+1;
                int d = nums.length - 1;

                if(b > a+1 && nums[b-1] == nums[b]) continue;

                while(c < d){
                    long sum = (long) nums[a] + nums[b] + nums[c] + nums[d];
                    if(sum == target){
                        al.add(Arrays.asList(nums[a],nums[b] , nums[c] , nums[d]));
                        c++;
                        d--;
                        while(c < d && nums[c] == nums[c-1]) c++;
                        while(c < d && nums[d] == nums[d+1]) d--;
                    }else if(sum > target){
                        d--;
                    }else{
                        c++;
                    }
                }
            }
        }
        return al;
    }

	public static void main(String[] args) {
		
		int[] nums = {1,4,5,2,3,7,8,9,0};
		FourSum fs = new FourSum();
		System.out.println(fs.fourSum(nums, 6));
		
	}

}
