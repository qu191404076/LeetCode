package array;

import java.util.Arrays;

/**
 * 
 * @author Administrator
 *
 *Array Partition I
 */
public class ArraySumMin {

	private static int[] a = { 1, 4, 3, 2, 5, 8 };

	// 自己
	public static int sum(int[] a) {
		int i = 0, sum = 0, m = a.length / 2;
		for (int j = 0; j < m; j++) {
			sum += a[i];
			i += 2;
		}
		return sum;

	}
	
	//答案
	public static int arrayPairSum(int[] nums) {
		Arrays.sort(nums);
		int result = 0;
		for (int i = 0; i < nums.length; i += 2) {
			result += nums[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Arrays.sort(a);
		System.out.println(sum(a));
		System.out.println(arrayPairSum(a));
	}
}
