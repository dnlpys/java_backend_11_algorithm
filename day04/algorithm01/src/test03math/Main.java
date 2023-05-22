package test03math;

import java.util.Scanner;

public class Main {

	/*
	 * 입력받은(주어진) 정수의 제곱을 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * 10
	 * 
	 * 출력 예시 :
	 * 
	 * 100
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int su = s.nextInt();//입력된 라인한줄 문자열
		int su = 10;
		
		System.out.println(solution(su));
		
		
	}//end main

	private static String solution(int su) {
		String answer = "";
		
		answer += (int)Math.pow(su, 2);
		
		return answer;
	}

}//end class
