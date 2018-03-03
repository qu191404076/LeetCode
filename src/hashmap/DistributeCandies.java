package hashmap;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Distribute Candies
 * 
 * @author Administrator
 * 
 *         Given an integer array with even length, where different numbers in
 *         this array represent different kinds of candies. Each number means
 *         one candy of the corresponding kind. You need to distribute these
 *         candies equally in number to brother and sister. Return the maximum
 *         number of kinds of candies the sister could gain.
 * 
 *         Example 1: Input: candies = [1,1,2,2,3,3] Output: 3 Explanation:
 *         There are three different kinds of candies (1, 2 and 3), and two
 *         candies for each kind. Optimal distribution: The sister has candies
 *         [1,2,3] and the brother has candies [1,2,3], too. The sister has
 *         three different kinds of candies. Example 2: Input: candies =
 *         [1,1,2,3] Output: 2 Explanation: For example, the sister has candies
 *         [2,3] and the brother has candies [1,1]. The sister has two different
 *         kinds of candies, the brother has only one kind of candies.
 */
public class DistributeCandies {
	
	private int candyNum; //brother and sister平均分得的个数
	private Set<Integer> brotherCandy = new HashSet(); //brother的糖果
	private Set<Integer> sisterCandy = new HashSet(); //sister的糖果

	public int distributeCandies(int[] candies) {
		candyNum = candies.length / 2;
		int temp = 0;
		for(int i = 0; i < candies.length; i++){
			if(!sisterCandy.contains(candies[i]) && temp != candyNum) sisterCandy.add(candies[i]);
			temp++;
		}
		int count = sisterCandy.size();
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {1,1,2,3};
		System.out.println(new DistributeCandies().distributeCandies(candies));
	}

}
