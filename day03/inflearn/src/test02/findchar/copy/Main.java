package test02.findchar.copy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * 입력받은(주어진) 문자열에서 특정문자의 갯수 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * Computercooler
	 * 
	 * c
	 * 
	 * 출력 예시 :
	 * 
	 * 2
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "StuDY";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		
//		System.out.println(Character.isUpperCase(str.charAt(0)));
		//toUpperCase(),toLowerCase()
		
		String[] arr = str.split("");
//		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			
			if(Character.isUpperCase(arr[i].charAt(0))) {
				answer += arr[i].toLowerCase();
			}else {
				answer += arr[i].toUpperCase();
			}
			
		}
		
		return answer;
	}

}//end class
