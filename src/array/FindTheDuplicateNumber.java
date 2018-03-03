package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Find the Duplicate Number
 * 
 * @author Administrator Given an array nums containing n + 1 integers where
 *         each integer is between 1 and n (inclusive), prove that at least one
 *         duplicate number must exist. Assume that there is only one duplicate
 *         number, find the duplicate one.
 * 
 *         Note: You must not modify the array (assume the array is read only).
 *         You must use only constant, O(1) extra space. Your runtime complexity
 *         should be less than O(n2). There is only one duplicate number in the
 *         array, but it could be repeated more than once.
 */
public class FindTheDuplicateNumber {

	public static int printDuplicateNum(int[] nums) {
		int num = 0;
		Arrays.sort(nums);
		Set<Integer> numSet = new HashSet(1);
		for (int i : nums) {
			if (numSet.contains(i)) {
				num = i;
			}
			numSet.add(i);
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 6, 3, 2, 4, 5 };
		System.out.println(printDuplicateNum(array));
	}

}
