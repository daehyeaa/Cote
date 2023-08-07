package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Cote11047 {

	public static void main(String[] args)throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine()); // 동전 종류 갯수
		int k = Integer.parseInt(br.readLine()); // 금액
		//int [] c = new int[n];	// 동전갯수 닫을
		int [] c = {1,5,10,50,100,500,1000,5000}; //  n = 7
		int count = 0;
		for(int i = n-1; i>=0; i--) {
			//System.out.println(i);
			System.out.println("i의값"+i);
			System.out.println("남은값"+k);
			count += k/c[i];
			//System.out.println(count);
			k = k%c[i];
		}
		
		System.out.println(count);
		
	}

}
