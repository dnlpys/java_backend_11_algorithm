package test02substring;

import java.util.Scanner;

public class Main2 {

	/*
	 * 입력받은(주어진) 문자열의 3번째부터 5번째까지를 뽑아서 
	 * 출력하는 프로그램을 작성하세요
	 * abcdefg 인경우 defg 가 출력됨
	 * 
	 * 
	 * 문자열은 0번째부터 시작됨
	 * 
	 * 입력 예시 :
	 * 
	 * abcdefg
	 * 
	 * 출력 예시 :
	 * 
	 * defg
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "abcdefg";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		answer = str.substring(3,5+1);
		
		return answer;
	}

}//end class
