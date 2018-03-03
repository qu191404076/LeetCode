package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Find Anagram Mappings
 * 
 * @author Administrator Given two lists Aand B, and B is an anagram of A. B is
 *         an anagram of A means B is made by randomizing the order of the
 *         elements in A.
 * 
 *         We want to find an index mapping P, from A to B. A mapping P[i] = j
 *         means the ith element in A appears in B at index j.
 * 
 *         These lists A and B may contain duplicates. If there are multiple
 *         answers, output any of them.
 * 
 *         For example, given
 * 
 *         A = [12, 28, 46, 32, 50] B = [50, 12, 32, 46, 28] We should return
 *         [1, 4, 3, 2, 0]
 */
public class FindAnagramMappings {
	
	private static int[] a,b,p;
	private static List<Integer> list = new ArrayList();
	
	public static int getArray(int length) {
		int i = (int)(Math.random() * 5);
		if(length == 1){
			list.add(a[i]);
			return a[i];
		}else{
			list.add(a[i]);
			return getArray(length - 1);
		}
	}
	
	//For遍历(复杂)
	public static void getAIndex(int[] a,int[] b, int[] p){
		int zero = 0;
		for(int m = 0; m < a.length; m++){
			for(int n = 0; n < b.length; n++){
				if(a[m] == b[n]){
					p[m] = n;
					break;
				}else if(a[m] != b[n] && n == b.length - 1){
					p[m] = -1;
				}
				
			}
		}
	}
	
	//Map集合实现     暂无实现，因与题目A、B数组内容可重复不符
	public static void getAIndex2(int[] a,int[] b, int[] p){
		Map<Integer,Integer> map = new HashMap();
		for(int i = 0; i < b.length; i++){
			map.put(b[i], i);
		}
		
		int temp = 0;
		for(int j : a){
			p[temp++] = map.get(j);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a = new int[]{12, 28, 46, 32, 50};
		getArray(a.length);
		b = new int[list.size()];
		p = new int[a.length];
		
		System.out.println("输入数组OR集合(未实现)");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		switch(s){
			case "数组" : 
						for(int i = 0; i < list.size(); i++){
							b[i] = list.get(i);
						}
						getAIndex(a,b,p);
						break;
			case "集合" : 
						getAIndex2(a,b,p);
		}
		
		
		
		//输出
		System.out.print("A: ");
		for(int j : a){
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.print("B: ");
		for(int j : b){
			System.out.print(j + " ");
		}
		System.out.println();
		System.out.print("P: ");
		for(int j : p){
			System.out.print(j + " ");
		}
	}

}
