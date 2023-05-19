package test07.woo0woo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "gooG";

		System.out.println(solution(str));//YES or NO
	}// end main

	private static String solution(String str) {
		String answer = "NO";
		//주어진 문자열이 대소분자 구분없이 뒤집은 문자열과 같다면 : YES
		if(str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())) {
			answer = "YES";
		}
		
		return answer;
	}
}// end class
