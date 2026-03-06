package in.developer.yash.dsa.arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearSearch{

	public static void main(String[] args) throws Exception {
		
		int arr[] = {9,2,4,5,6,8,7};
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int inp = Integer.parseInt(br.readLine());
		
		boolean isFound = false;
		
		for(int i = 0; i<arr.length; i++) {
			if(inp==arr[i]) {
				 isFound = true;
				 System.out.println("The element is found at the index: " + i);
				 break;
			}
		}
		
		if(isFound == false) {
		System.out.println("The given array does not contain the element");
		}
	}
	
}

//done
