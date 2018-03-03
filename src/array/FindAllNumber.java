package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Find All Numbers Disappeared in an Array
 * 
 * @author Administrator
 * 
 *         Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array),
 *         some elements appear twice and others appear once.
 * 
 *         Find all the elements of [1, n] inclusive that do not appear in this
 *         array.
 * 
 *         Could you do it without extra space and in O(n) runtime? You may
 *         assume the returned list does not count as extra space.
 * 
 *         Example:
 * 
 *         Input: [4,3,2,7,8,2,3,1]
 * 
 *         Output: [5,6]
 */
public class FindAllNumber {

	public static List<Integer> outPut(int[] a) {
		List<Integer> array = new ArrayList();
		for(int i = 0; i < a.length; i++){
			int temp = Math.abs(a[i]) - 1;
			a[temp] = a[temp] > 0 ? -a[temp] : a[temp];
		}
		for(int i = 0; i < a.length; i++){
			if(a[i] > 0){
				array.add(i+1);
			}
		}
		return array;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {4,3,2,7,8,2,3,1};
		for(int i : outPut(a)){
			System.out.print(i + " ");
		}
		
	}

}
