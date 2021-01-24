package array;

/**
 * Subarray Sum Equals K
 * 
 * @author Administrator Given an array of integers and an integer k, you need
 *         to find the total number of continuous subarrays whose sum equals to
 *         k.
 * 
 *         Example 1: Input:nums = [1,1,1], k = 2 Output: 2
 */
public class SubarraySumEqualsK {

	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; start++) {
			for (int end = start + 1; end <= nums.length; end++) {
				int sum = 0;
				for (int i = start; i < end; i++)
					sum += nums[i];
				if (sum == k)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,1,1};
		System.out.println(subarraySum(array,2));
	}

}
