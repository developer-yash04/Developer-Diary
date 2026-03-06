package in.developer.yash.dsa.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	
		public static int removeDuplicates(int []arr) {
			
			Arrays.sort(arr);
			
			int left = 0, right = 1;
			
			while(right < arr.length) {
				
				if(arr[left] == arr[right]) {
					right += 1;
				}else {
					arr[left + 1] = arr[right];
					left += 1;
					right += 1;
				}
				
			}
			
			System.out.println(left + 1);
			return left + 1;
			
		}
	

	    public static void main(String[] args) {
		
		   int arr[] = {2,1,45,1,4,4};
		   
		   RemoveDuplicates.removeDuplicates(arr);
		   
		   
	}
	
}
