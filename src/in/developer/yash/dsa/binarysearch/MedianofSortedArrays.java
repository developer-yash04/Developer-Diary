package in.developer.yash.dsa.binarysearch;

import java.util.Arrays;

public class MedianofSortedArrays {
	
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length , n = nums2.length;

        int a = 0 , b = 0;
        int nums[] = new int[m + n];

        for(int i =0 ; i < nums.length; i++){
            if(a < m && (b >= n || nums1[a] <= nums2[b])){
                nums[i] = nums1[a];
                a++;
            }else{
                nums[i] = nums2[b];
                b++;
            }
        }

        double median = 0;

        if(nums.length %2==0){
            median = (nums[(nums.length-2)/2] + nums[nums.length/2])/2.0;
        }else{
            median = nums[(nums.length-1)/2];
        }
        System.out.println(Arrays.toString(nums));
        
    return median;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MedianofSortedArrays m = new MedianofSortedArrays();
		int nums1[] = {1,2,5};
		int nums2[] = {4,5,6};
		
		double result = m.findMedianSortedArrays(nums1, nums2);
		System.out.println("The median is: " + result);
	}

}
