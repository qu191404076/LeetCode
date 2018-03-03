package array;

import java.util.Arrays;

/**
 * Maximum Product of Three Numbers
 * 
 * @author Administrator Given an integer array, find three numbers whose
 *         product is maximum and output the maximum product.
 * 
 *         Example 1: Input: [1,2,3] Output: 6 Example 2: Input: [1,2,3,4]
 *         Output: 24
 */
public class MaximumOfThreeNumbers {
	
	public static int maxNum(int[] a){
		if(a.length > 2){
			Arrays.sort(a);
			return Math.max(a[0] * a[1] * a[a.length - 1], a[a.length - 3] * a[a.length - 2] * a[a.length - 1]);
		}else{
			return 0;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array  = {-100,-530,200,1,2,3};
		System.out.println(maxNum(array));
	}

}
