package array;

/**
 * Two Sum II - Input array is sorted
 * 
 * @author Administrator
 * 
 *         Given an array of integers that is already sorted in ascending order,
 *         find two numbers such that they add up to a specific target number.
 * 
 *         The function twoSum should return indices of the two numbers such
 *         that they add up to the target, where index1 must be less than
 *         index2. Please note that your returned answers (both index1 and
 *         index2) are not zero-based.
 * 
 *         You may assume that each input would have exactly one solution and
 *         you may not use the same element twice.
 * 
 *         Input: numbers={2, 7, 11, 15}, target=9 Output: index1=1, index2=2
 */
public class TwoSumII {
	
	public static int[] twoSumII(int[] a,int target){
		int left = 0,right = a.length - 1;
		int[] array = new int[2];
		while(left < right){
			int temp = a[left] + a[right];
			if(temp == target){
				array[0] = left + 1;
				array[1] = right + 1;
				break;
			}else if(temp > target){
				right--;
			}else{
				left++;
			}
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,11,13};
		for(int i : twoSumII(a,20)){
			System.out.print(i + " ");
		}
	}

}
