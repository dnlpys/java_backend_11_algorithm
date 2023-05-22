package test04arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	/*
	 * 입력받은(주어진) 문자열을 순정렬해서 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * 33 22 44 11
	 * 
	 * 출력 예시 :
	 * 
	 * 11 22 33 44
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "33 22 44 11";
		
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		//str >> 문자열배열
		String[] arr = str.split(" ");
//		System.out.println(Arrays.toString(arr));
		
		//문자열배열 >> 정수배열
		Integer[] sus = new Integer[arr.length];
		
		for (int i = 0; i < sus.length; i++) {
			sus[i] = Integer.parseInt(arr[i]);
		}
		System.out.println(Arrays.toString(sus));
		
		//뒤집기 11, 44, 22, 33
		List<Integer> slist = Arrays.asList(sus);
		Collections.reverse(slist);
		System.out.println(slist);
		
		//순정렬 11, 22, 33, 44
		Arrays.sort(sus);
		System.out.println(Arrays.toString(sus));
		
		
		//순정렬후 뒤집기 >> 역정렬  44, 33, 22, 11
		List<Integer> dlist = Arrays.asList(sus);
		Collections.reverse(dlist);
		System.out.println(dlist);
		
		
		for (int i = 0; i < sus.length; i++) {
			arr[i] = String.valueOf(sus[i]);
		}
//		System.out.println(arr);
		
//		List<String> list = Arrays.asList(arr);
//		Collections.reverse(list);
//		System.out.println(list);
		
		answer = String.join(" ", arr);
		
		//answer 할당
		return answer;
	}

}//end class
