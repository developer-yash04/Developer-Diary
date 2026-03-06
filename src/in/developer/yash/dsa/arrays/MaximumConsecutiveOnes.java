package in.developer.yash.dsa.arrays;

public class MaximumConsecutiveOnes {
	
// This question is basically the combo of Linear Search and Largest number

	public static void main(String[] args) {
		
		int arr[] = {1,2,1,1,1,5,5,7,6,1,1,3,1};
		
		int max = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i]==1) {
				count++;
				
				if(count > max) {
					max = count;
				}
				
			}else {
				count = 0;
			}
			
		}
		
		System.out.println("Maximum time ones appeared is : " + max);
		
	}
	
}
