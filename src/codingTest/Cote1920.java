package codingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cote1920 {
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		int length = Integer.parseInt(br.readLine());
		
		int [] arr = new int[length];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1 + "\n");
			}else {
				sb.append("0" + "\n");
			}
		}
		System.out.println(sb);
		
	}// main end
	
	public static int binarySearch(int [] arr, int target) {
		int low = 0;
		int high = arr.length - 1;
		
		while(low<=high) {
			int mid = (low + high) /2;
			
			if(arr[mid]< target ) {
				low = mid+1;
			}else if(arr[mid] > target) {
				high = mid -1;
			}else {
				System.out.println("kk");
				return mid;
			}
		}
		return -1;
	}
	

}
