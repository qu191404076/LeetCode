package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Best Time to Buy and Sell Stock
 * 
 * @author Administrator Say you have an array for which the ith element is the
 *         price of a given stock on day i.
 * 
 *         If you were only permitted to complete at most one transaction (ie,
 *         buy one and sell one share of the stock), design an algorithm to find
 *         the maximum profit.
 * 
 *         Example 1: Input: [7, 1, 5, 3, 6, 4] Output: 5
 * 
 *         max. difference = 6-1 = 5 (not 7-1 = 6, as selling price needs to be
 *         larger than buying price) Example 2: Input: [7, 6, 4, 3, 1] Output: 0
 * 
 *         In this case, no transaction is done, i.e. max profit = 0.
 */
public class BestTimeToBuyAndSellStock {
	
	public static int bestBuyAndSell(int[] a){
		int i = 0,temp = 0,m;
		while(i < a.length - 1){
			for(int j = i + 1; j < a.length; j++){
				if(a[j] > a[i]){
					m = a[j] - a[i];
					temp = Math.max(m, temp);
				}
			}
			i++;
		}
		return temp;
	}
	
	//Time Complexity:O(N)
	public static int bestBuyAndSell2(int[] a){
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] < minPrice){
				minPrice = a[i];
			}else if(a[i] - minPrice > maxProfit){
				maxProfit = a[i] - minPrice;
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {7, 1, 5, 3, 6, 4};
		System.out.println(bestBuyAndSell(array));
		System.out.println(bestBuyAndSell2(array));
	}

}
