package codingTest;

import java.util.Scanner;

public class Cote2606 {

	static int count = 0;
	
	static void dfs(int[][] a, boolean[] check, int v) {
		if(check[v] == true)
			return;
		
		check[v] = true;
		count++;
		
		for(int i=0; i<a[v].length; i++) {
			if(a[v][i] == 1 && check[i] == false)
				dfs(a,check,i);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int comsu = sc.nextInt();
		int linksu = sc.nextInt();
		
		int a[][] = new int[comsu+1][comsu+1];
		boolean check[] = new boolean[comsu+1];
		
		for(int i=0; i<linksu; i++) {
			int c = sc.nextInt();
			int d = sc.nextInt();
			
			a[c][d] = 1;
			a[d][c] = 1;
			
		}
		
		dfs(a,check,1);
		
		System.out.println(count-1);
	}
}
