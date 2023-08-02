package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Cote9012 {

	public static void main(String[] args)throws IOException{
		
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			// br.readLine() String 
//			String s = br.readLine();
//			String [] arr = new String[1000];
//			for(int i=0; i<s.length(); i++) {
//				arr = s.split("");
//			}
//			
//			System.out.println(Arrays.toString(arr));

		 
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		
//		for(int i = 0; i < T; i++) {
//			String S = br.readLine();
//			
//			//문자열의 각 자리의 값을 확인할때는 char형태로 바꿔서 확인하기 때문에 스택도 Character형으로 해준다.
//			Stack<Character> stack = new Stack<Character>();
//			
//			for(int j = 0; j < S.length(); j++) {
//				if(S.charAt(j) == '(') {
//					stack.push(S.charAt(j));
//				}else {
//					//비어있는지를 먼저 본다.
//					if(stack.empty()) {
//						stack.push(S.charAt(j));
//						break;
//					}else {
//						stack.pop();
//					}
//				}
//			}
//			if(stack.empty()) System.out.println("YES");
//			else System.out.println("NO");
//		}
		
		System.out.println("몇개를 할거냐?");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringBuffer sb = new StringBuffer();
		int Num = Integer.parseInt(br.readLine()); // 입력
		
		for(int i=0; i<Num; i++) {
			sb.append(solve(br.readLine()));	// 문자열씩으로 한번만 값들을 모아서 
		}
		// 뿌려주기 
		System.out.println(sb);
	}
	// 하나의 문자열 
	public static String solve(String br) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<br.length(); i++) {
			if(br.charAt(i) == '(') {			
				stack.push(br.charAt(i));							
			}else if(stack.isEmpty() == true) {	// ture면 length 0 
					return "No";					
			}else{
				stack.pop();
			}
		}
		
		// 해당 값들이 다 되고 스택이 비어 있으면 성공적인거고 아니면 잘못된 '(' , ')' 이다
		if(stack.isEmpty()) {
			return "Yes";
		}else {
			return "No";
		}
	}
}
