package test03math;

import java.util.Scanner;

public class Main2 {

	/*
	 * 입력받은(주어진) 정수의 15제곱을 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * 2
	 * 
	 * 15
	 * 
	 * 출력 예시 :
	 * 
	 * 32768
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int su = s.nextInt();//입력된 라인한줄 문자열
//		int su2 = s.nextInt();//입력된 라인한줄 문자열
		int su1 = 2;
		int su2 = 15;
		
		System.out.println(solution(su1,su2));
		
		
	}//end main

	private static String solution(int su1,int su2) {
		String answer = "";
		
		answer += (int)Math.pow(su1, su2);
		
		return answer;
	}

}//end class
