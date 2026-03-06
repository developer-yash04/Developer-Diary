package in.developer.yash.dsa.arrays;

import java.util.Arrays;

public class MoveZeroes {
	
//Two pointers - both at opposite extremes
	
	public static void main(String[] args) {
		
		int arr[] = {0,0,1,4,5,7,5};
		
		int left = 0, right = arr.length-1;
		
		while(left < right) {
			if(arr[left] == 0 && arr[right] !=0) {
				int temp = arr[left];
				 arr[left] = arr[right]; 
				 arr[right] = temp;
				 left++; 
				 right--;
			}else if(arr[right] == 0 ){
				right--;
				
			}else {
				left++;
				
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
