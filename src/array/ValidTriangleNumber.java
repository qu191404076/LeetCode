package array;

import java.util.Arrays;

/**
 * Valid Triangle Number
 * 
 * @author Administrator Given an array consists of non-negative integers, your
 *         task is to count the number of triplets chosen from the array that
 *         can make triangles if we take them as side lengths of a triangle.
 * 
 *         Example 1: Input: [2,2,3,4] Output: 3 Explanation: Valid combinations
 *         are: 2,3,4 (using the first 2) 2,3,4 (using the second 2) 2,2,3
 * 
 */
public class ValidTriangleNumber {
	
	//Time complexity:O(N^3)
	//Time Out
	public static int triangleNumber(int[] a){
		int count = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = i + 1; j < a.length; j++){
				for(int m = j + 1; m < a.length; m++){
					int addTemp = a[i] + a[j];
					int subtractTemp = a[i] - a[j];
					if(addTemp > a[m] && subtractTemp < a[m]){
						count++;
					}
				}
			}
		}
		return count;
	}
	
	//Time Complexity:O(n^2)
	public static int triangleNumber2(int[] a){
		int count = 0;
		Arrays.sort(a);
		for(int i = 0; i < a.length - 2; i++){
			int k = i + 2;
			for(int j = i + 1; j < a.length - 1; j++){
				while(k < a.length && a[i] + a[j] > a[k]){
					k++;
					count++;
				}
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {2,2,3,4};
		System.out.println(triangleNumber(array));
		System.out.println(triangleNumber2(array));
	}

}
