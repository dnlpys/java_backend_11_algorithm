package test.com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	/*
	 * 입력받은(주어진) 문자열의 길이를 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * abcdefg
	 * 
	 * 출력 예시 :
	 * 
	 * 7
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "abcdefg";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static int solution(String str) {
		
		
		
		return str.length();
	}

}//end class
