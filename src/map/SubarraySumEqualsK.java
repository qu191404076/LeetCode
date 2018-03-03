package map;

import java.util.HashMap;
import java.util.Map;

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

	// For循环
	public static int subarraySumByArray(int[] nums, int k) {
		int sum = 0, count = 0;
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				sum += nums[j];
				if (sum == k) {
					count++;
				}
			}
			sum = 0;
		}
		return count;
	}

	// 以下为最佳解决方案

	// Map集合 O(n)
	public static int subarraySum(int[] nums, int k) {
		int count = 0, sum = 0;
		Map<Integer, Integer> map = new HashMap();
		map.put(0, 1);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (map.containsKey(sum - k))
				count += map.get(sum - k);
			if (map.get(sum) == null) {
				map.put(sum, 0);
			}
			map.put(sum, map.get(sum) + 1);
		}
		return count;
	}

	// 累积和 O(n^2)
	public int subarraySum2(int[] nums, int k) {
		int count = 0;
		int[] sum = new int[nums.length + 1];
		sum[0] = 0;
		for (int i = 1; i <= nums.length; i++)
			sum[i] = sum[i - 1] + nums[i - 1];
		for (int start = 0; start < nums.length; start++) {
			for (int end = start + 1; end <= nums.length; end++) {
				if (sum[end] - sum[start] == k)
					count++;
			}
		}
		return count;
	}

	//没有使用额外存储空间   O(n^2)
	public int subarraySum3(int[] nums, int k) {
		int count = 0;
		for (int start = 0; start < nums.length; start++) {
			int sum = 0;
			for (int end = start; end < nums.length; end++) {
				sum += nums[end];
				if (sum == k)
					count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int[] array2 = { 1, 2, 3 };
		int key = 0;
		int key2 = 3;
		// System.out.println(subarraySum(array, key));
		System.out.println(subarraySumByArray(array2, key2));
	}

}
