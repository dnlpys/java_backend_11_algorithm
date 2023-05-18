package test02substring;

import java.util.Scanner;

public class Main4 {

	/*
	 * 입력받은(주어진) 문자열을 뒤집어서 
	 * 출력하는 프로그램을 작성하세요
	 * abcdefg 인경우 gfedcba 가 출력됨
	 * 
	 * 
	 * 입력 예시 :
	 * 
	 * abcdefg
	 * 
	 * 출력 예시 :
	 * 
	 * gfedcba
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "abcdefg";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
//		System.out.println(str.charAt(0));//a
//		System.out.println(str.charAt(str.length()-1));//g
		
//		for (int i = str.length()-1; i >= 0; i--) {
//			answer += str.charAt(i);
//		}
		
		answer = new StringBuffer(str).reverse().toString();
		
//		char[] cs = str.toCharArray();
//		for (int i = str.length() - 1; i >= 0; i--) {
//			answer += cs[i];
//		}
		
		return answer;
	}

}//end class
