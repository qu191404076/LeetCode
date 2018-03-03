package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductOfArrayExceptSelf {
	
	
	public static int[] productExceptSelf(int[] nums) {
	    int n = nums.length;
	    int[] res = new int[n];
	    res[0] = 1;
	    for (int i = 1; i < n; i++) {
	        res[i] = res[i - 1] * nums[i - 1];
	    }
	    int right = 1;
	    for (int i = n - 1; i >= 0; i--) {
	        res[i] *= right;
	        right *= nums[i];
	    }
	    return res;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4};
		for(int i : productExceptSelf(array)){
			System.out.print(i + " ");
		}
	}

}
