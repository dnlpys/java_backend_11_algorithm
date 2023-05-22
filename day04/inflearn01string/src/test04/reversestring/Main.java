package test04.reversestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 3;
		String[] arr = new String[] {"good","Time","Big"};
//		String[] arr = new String[len];
//		for (int i = 0; i < len; i++) {
//			String str = s.nextLine();//good,Time,Big
//			arr[i] = str;
//		}
		
		solution(arr);
	}//end main

	private static void solution(String[] arr) {
			
		for (String x : arr) {
			System.out.println(new StringBuffer(x).reverse());
		}
	}
}//end class
