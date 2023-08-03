package codingTest;

import java.util.ArrayList;
import java.util.Scanner;

public class Cote2501 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("숫자를 입력하세요.");
		Scanner sc = new Scanner(System.in);		
		int N = sc.nextInt();
		sc.nextLine();
		System.out.println("몇번째 수를 찾을려고 합니까??");
		int K = sc.nextInt();
				
		for(int i=1; i<=N; i++) {
			if(N % i == 0) {
			 list.add(i);
			}
		}		
		
		
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == K) {
				System.out.println(i+1);
			}
		}
		
		if(!list.contains(K)){
			System.out.println(0);
        }
		
		
		
	}

}
