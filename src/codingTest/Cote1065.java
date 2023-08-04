package codingTest;

import java.util.Arrays;
import java.util.Scanner;

//백준 1065 한수
public class Cote1065 {

	public static void main(String[] args) {
		
		System.out.println("수를 입력하세요.");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(i<= 99) {
				count++;
			}else if(i<=999) {
				String [] arr = Integer.toString(i).split(""); // 박싱 하고 split
				if(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]) == 
						Integer.parseInt(arr[1]) - Integer.parseInt(arr[2]));
//				String numArr = Integer.toString(i);
//				int a = Integer.parseInt(numArr.substring(0, 1)) 
//					- Integer.parseInt(numArr.substring(1, 2));
//				int b =	Integer.parseInt(numArr.substring(1, 2)) 
//						- Integer.parseInt(numArr.substring(2, 3));
//				if( a == b) 
//					count++;				
			}
		}
		System.out.println("갯수"+count);
	}
}
