package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Judge Route Circle
 * 
 * @author Administrator Initially, there is a Robot at position (0, 0). Given a
 *         sequence of its moves, judge if this robot makes a circle, which
 *         means it moves back to the original place.
 * 
 *         The move sequence is represented by a string. And each move is
 *         represent by a character. The valid robot moves are R (Right), L
 *         (Left), U (Up) and D (down). The output should be true or false
 *         representing whether the robot makes a circle.
 * 
 *         Example 1: Input: "UD" Output: true Example 2: Input: "LL" Output:
 *         false
 */
public class JudgeRouteCircle {

	public static boolean inputKey(String order) {
		int x = 0, y = 0;
		for (char orderChar : order.toCharArray()) {
			if (orderChar == 'U')
				y++;
			if (orderChar == 'D')
				y--;
			if (orderChar == 'L')
				x--;
			if (orderChar == 'R')
				x++;
		}
		return x == 0 && y == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println(inputKey(scanner.next().toUpperCase()));

	}

}
