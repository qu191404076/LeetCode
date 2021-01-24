package array;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 
 * @author Administrator
 * 
 *	Reshape the Matrix
 */
public class ReshapeMatrix {
	
	private static int[][] a = {{1,2,3},{4,5,6}};
	
	
	public static int[][] reshapeMatrix(int[][] a, int r, int c){
		if(a.length == 0 || r * c != a.length * a[0].length){
			return a;
		}
		
		int[][] array = new int[r][c];
		int rows = 0,cols = 0;
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				array[rows][cols] = a[i][j];
				cols++;
				if(cols == c){
					rows++;
					cols = 0;
				}
			}
		}
		return array;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt(),c = scanner.nextInt();
		int[][] array = reshapeMatrix(a,r,c);
		for(int[] i : array){
			for(int j : i){
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
	}

}
