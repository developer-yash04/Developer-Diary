package in.developer.yash.dsa.arrays;

public class KadaneAlgorithm {
	//Idea : If the running sum becomes negative → drop it.
	public int kadaneAlgorithm(int nums[]) {
		
		int sum = 0, max = nums[0];
		
		for(int i = 0; i< nums.length; i++) {
			sum += nums[i];
			max = Integer.max(max, sum);
			
			if(sum<0) {
				sum = 0;
			}	
			
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		KadaneAlgorithm ka = new KadaneAlgorithm();
		int nums[] = {-1,-7,-9};
		
		int result = ka.kadaneAlgorithm(nums);
		System.out.println(result);
	}
	
}
