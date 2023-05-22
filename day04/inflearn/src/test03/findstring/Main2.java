package test03.findstring;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "it is timed to study";
		System.out.println(solution(str));
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		List<String> list = Arrays.asList(str.split(" "));
//		System.out.println(list);
//		
////		Collections.sort(list);//문자정렬
//		list.sort(Comparator.comparing(String::length));//단어길이정렬
//
//		System.out.println(list);
		
		//가장 긴 단어가 무엇인지?(같은 단어 발생시 첫번째단어 반환)
//		answer = list.stream().max(Comparator.comparingInt(String::length)).get();
		answer = list.stream().max(Comparator.comparing(String::length)).get();
		
		//가장긴 단어의 길이를 알고 싶다면 아래와같이.
//		System.out.println(list.stream().map(String::length).max(Integer::compare).get());
		return answer;
	}
}//end class
