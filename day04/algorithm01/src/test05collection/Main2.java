package test05collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Stack;

public class Main2 {

	/*
	 * 입력받은(주어진) 문자열에서 중복된 문자열 배제하여 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * Hello java java html java
	 * 
	 * 출력 예시 :
	 * 
	 * Hello html java
	 * 
	 *
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "Hello java java html java";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		//배제는 중복된 java를 제거하는거와는 다르다.
//		System.out.println(str.replace("java", ""));
//		answer = str.replace("java", "");
//		answer = answer.replace("   ", " ");
		
		String[] arr = str.split(" ");
		System.out.println(String.join(" ", arr));
		
		//Set을 사용해서 중복문자는 배제
		answer = String.join(" ", new HashSet<String>(Arrays.asList(arr)));
		
		return answer;
	}

}//end class
