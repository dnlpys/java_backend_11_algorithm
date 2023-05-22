package test05collection;

import java.util.Scanner;
import java.util.Stack;

public class Main {

	/*
	 * 입력받은(주어진) 문자열에서 끝에서 3단어를 제거하여 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * Hello world java html css
	 * 
	 * 출력 예시 :
	 * 
	 * Hello world
	 * 
	 * aa bb cc dd ee ff
	 * aa bb cc 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "Hello world java html css";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		String[] arr = str.split(" ");
		
//		for (int i = 0; i < arr.length-3; i++) {
//			answer += arr[i] +" ";
//		}
		
		Stack<String> st = new Stack<String>();
		for (int i = 0; i < arr.length; i++) {
			st.push(arr[i]);
		}
		System.out.println(st);
		
		for (int i = 0; i < 3; i++) {
			st.pop();
		}
		System.out.println(st);
//		for (String x : st) {
//			answer += x +" ";
//		}
//		System.out.println(String.join(" ", st));
		
		answer = String.join(" ", st);
		
		return answer;
	}

}//end class
