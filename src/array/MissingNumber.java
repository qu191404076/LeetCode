package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Missing Number
 * 
 * @author Administrator Given an array containing n distinct numbers taken from
 *         0, 1, 2, ..., n, find the one that is missing from the array.
 * 
 *         For example, Given nums = [0, 1, 3] return 2.
 */
public class MissingNumber {
	
	public static Set<Integer> missNumber(int[] nums){
		Set<Integer> numSet = new HashSet();
		Arrays.sort(nums);
		for(int i = 1; i < nums.length; i++){
			if(nums[i] - nums[i - 1] != 1){
				for(int j = nums[i - 1]; j < nums[i] - 1; j++){
					numSet.add(j + 1);
				}
				
			}
		}
		return numSet;
	}
	
	
	public static int missNumber2(int[] a){
		int i = 0,m = 0; 
		for(i = 0; i < a.length; i++){
			m = m ^ i ^ a[i];
		}
		return m ^ i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,3};
		for(int i : missNumber(array)){
			System.out.println(i);
		}
		System.out.println(missNumber2(array));
	}

}
