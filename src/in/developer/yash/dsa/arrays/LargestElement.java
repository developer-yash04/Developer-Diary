package in.developer.yash.dsa.arrays;


public class LargestElement {

	//Largest number in an array
	public void LargestElement(){
		
		int max = Integer.MIN_VALUE;
		
		int arr[] = {2,4,5,7,8,4,1};
		
		for(int i =1; i< arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
		
	}
	
	//Second Largest Element	
	public void SecondLargestElement() {
		
		int arr[] = {2,4,5,8,7};
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		
		for(int i = 0; i< arr.length; i++) {			
			if(max < arr[i] ) {
				secMax = max;
				max = arr[i];
			}else if (arr[i] > secMax && arr[i] != max) {
	            secMax = arr[i];
	        }
		}		
		System.out.println(secMax);
	}
	
	
	
	public static void main(String[] args) {
		
		LargestElement e = new LargestElement();
		System.out.print("The Largest Element is: ");
		e.LargestElement();
		
		System.out.println();
		
		System.out.print("The Second Largest Element is: ");
		e.SecondLargestElement();
	}
	
}
