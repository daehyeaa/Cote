package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cote1316 {
	
	public static boolean check(String s) {

		boolean[] arr = new boolean[26];

		int prev = 0; // 이전 문자
		for (int i = 0; i < s.length(); i++) {

			int now = (int) s.charAt(i); // 현재 문자
			if (prev != now) { // 같지 않으면
				if (arr[now - 'a'] == false) { // 해당글자 있는지 없으면 확인
					arr[now - 'a'] = true; // 없으면 ture로 넣기
					prev = now;
				} else {
					return false;
				}
			}

		}
		return true;
	}
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringBuilder sb = new StringBuilder();
		int count =0;
		int N = Integer.parseInt(br.readLine());
		
		for(int i=0; i<N; i++) {
			String s = br.readLine();
			if( check(s) == true) {				
				count++;
			}
			
		}
		System.out.println(count);
		
	}

}
