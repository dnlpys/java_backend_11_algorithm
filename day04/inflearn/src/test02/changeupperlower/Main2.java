package test02.changeupperlower;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "StuDY";
		System.out.println(solution(str));
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		String[] arr = str.split("");
		List<String> list = Arrays.asList(arr);
		
//		list = list.stream().map(x->x+"aaa").collect(Collectors.toList());
//		list = list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
//		answer = list.stream().map(x->x+"aaa").collect(Collectors.joining());
//		answer = list.stream().map(x->x.toUpperCase()).collect(Collectors.joining());
//		System.out.println(list);
		
		answer = list.stream().map(x->{
			if(Character.isUpperCase(x.charAt(0))) {
				return x.toLowerCase();
			}else {
				return x.toUpperCase();
			}
		}).collect(Collectors.joining());

		return answer;
	}
}//end class
