package array;

/**
 * 
 * Max Consecutive Ones
 * @author Administrator
 *		Given a binary array, find the maximum number of consecutive 1s in this array.
 */
public class MaxConsecutiveOnes {
	
	
	public int max(int[] a){
		int max = 0,maxHere = 0;
		for(int i : a){
			max = Math.max(max, maxHere = i == 0 ? 0 : maxHere + 1);
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1};
		System.out.println(new MaxConsecutiveOnes().max(array));
	}

}
