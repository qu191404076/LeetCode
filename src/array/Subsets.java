package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Subsets
 * 
 * @author Administrator Given a set of distinct integers, nums, return all
 *         possible subsets.
 * 
 *         Note: The solution set must not contain duplicate subsets.
 * 
 *         For example, If nums = [1,2,3], a solution is:
 * 
 *         [ [3], [1], [2], [1,2,3], [1,3], [2,3], [1,2], [] ]
 */
public class Subsets {
	
	public static List<List<Integer>> subset(int[] a){
		Arrays.sort(a);
		List<List<Integer>> integerList = new ArrayList();
		integerList.add(new ArrayList<Integer>());
		
		for(int i : a){
			List<List<Integer>> temp = new ArrayList();
			for(List<Integer> list : integerList){
				List<Integer> m = new ArrayList(list);
				m.add(i);
				temp.add(m);
			}
			integerList.addAll(temp);
		}
		return integerList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3};
		List<List<Integer>> show = subset(array);
		for(List<Integer> integerList : show){
			for(int i : integerList){
				System.out.print(i + " ");
			}
			System.out.println();
		}
		
	}

}
