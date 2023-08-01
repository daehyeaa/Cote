package codingTest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// x.compareTo(y)
// x의 값이 크면 1 같으면 0 적으면 -1
// compareTo 함수 
// 문자열 일때는 
// "abcd" - "ab" = 2
// "abcd" - "a" = 3
// "abcd" - "c" = 문자열 첫글짜가 달라버리면 문자열과 문자가 되버려서 각 문자열의 앞글짜 끼리 비교해서 -2 값이 나온다.

public class Cote1181 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("몇개의 단어를 입력 합니까?");
		Scanner sc = new Scanner(System.in);
				
		int Num = sc.nextInt();
		
		String[] arr = new String[Num];
		sc.nextLine();
		
		
		
		for(int i=0; i<Num; i++) {
			arr[i] = sc.nextLine();
		}
		
		// Array.sort(arr, new Comparator <>) sort에 대한 자기 메소드로 재정의 하여 사용 할 수 있다.
		// omparator<클래스타입> 클래스명 = new Comparator<클래스타입>()으로 정의하고 일반적으로 compare메소드를 오버라이드해서 사용한다. 
		// 클래스타입 비교대상 2개를 지역변수 o1,o2로 선언하고 return값으로 음수,0,양수를 반환하면서 정렬할 수 있다. 
		
		Arrays.sort(arr, new Comparator<String>() {
			public int compare(String s1, String s2) {
				if(s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} else {
					return s1.length() - s2.length();
				}
			}
		});
		
		// 임의로 0번째는 출력해줘야 한다.
		System.out.println(arr[0]);
		
		for(int i = 1; i<arr.length; i++) {
			if(!arr[i].equals(arr[i-1])) {
				System.out.println(arr[i]);
			}
		}
	}

}
