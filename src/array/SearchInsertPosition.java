package array;

import java.util.Arrays;

/**
 * Search Insert Position
 * 
 * @author Administrator Given a sorted array and a target value, return the
 *         index if the target is found. If not, return the index where it would
 *         be if it were inserted in order.
 * 
 *         You may assume no duplicates in the array.
 * 
 *         Here are few examples. [1,3,5,6], 5 → 2 [1,3,5,6], 2 → 1 [1,3,5,6], 7
 *         → 4 [1,3,5,6], 0 → 0
 * 
 */
public class SearchInsertPosition {

	public static int searchInsertPosition(int[] a, int target){
		Arrays.sort(a);
		int m = 0;
		for(int i : a){
			if(i == target){
				return m;
			}else{
				m = (target > i) ? (i > target) ? m - 1 : m : m - 1;
				m++;
				
			}
		}
		return m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,5,6};
		System.out.println(searchInsertPosition(array,2));
	}

}
