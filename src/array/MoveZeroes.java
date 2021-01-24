package array;

/**
 * 
 * @author Administrator
 *
 *Move Zeroes
 */
public class MoveZeroes {
	
	public static void moveZeroes(int[] nums) {
	    if (nums == null || nums.length == 0) return;        

	    int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0) nums[insertPos++] = num;
	    }        

	    while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    }
	    for(int i : nums){
	    	System.out.print(i + " ");
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {0,2,4,0,1,5,6,0,3,0};
		moveZeroes(a);
	}

}
