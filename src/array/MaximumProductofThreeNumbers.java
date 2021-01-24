package array;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *
 *Maximum Product of Three Numbers
 *Given an integer array, find three numbers whose product is maximum and output the maximum product.
 */
public class MaximumProductofThreeNumbers {
	
	public static int array(int a[]){
		Arrays.sort(a);
		int length = a.length;
		int max = Math.max(a[0] * a[1] * a[length - 1], a[length -1] * a[length -2] * a[length - 3]);
		return max;
	}
	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		System.out.println(array(a));
	}
}
