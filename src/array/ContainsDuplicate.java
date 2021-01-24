package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Contains Duplicate
 * 
 * @author Administrator Given an array of integers, find if the array contains
 *         any duplicates. Your function should return true if any value appears
 *         at least twice in the array, and it should return false if every
 *         element is distinct.
 */
public class ContainsDuplicate {
	
	//Time Complexity: O(N)
	public static boolean sameNum(int[] nums){
		Set<Integer> number = new HashSet(nums.length);
		for(int num : nums){
			if(number.contains(num)){
				return true;
			}
			number.add(num);
		}
		return false;
	}
	
	//Time Complexity: O(N^2)
	public static boolean sameNum2(int[] nums){
		for(int i = 0; i < nums.length - 1; i++){
			for(int j = i + 1; j < nums.length; j++){
				if(nums[j] == nums[i]) return true;
			}
		}
		return false;
	}
	
	//Time Complexity:  O(NlgN)
	public static boolean sameNum3(int[] nums){
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++){
			if(nums[i] == nums[i - 1]) return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,53,12};
		System.out.println(sameNum(array));
		System.out.println(sameNum2(array));
		System.out.println(sameNum3(array));
	}

}
