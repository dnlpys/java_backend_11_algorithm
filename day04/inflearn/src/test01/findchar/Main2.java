package test01.findchar;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str1 = s.nextLine();//입력된 라인한줄 문자열
//		String str2 = s.nextLine();//입력된 라인한줄 문자열
		String str1 = "Computercooler";
		String str2 = "c";
		
		System.out.println(solution(str1,str2));
		
		
	}//end main

	private static String solution(String str1,String str2) {
		String answer = "";
		
		List<String> list = Arrays.asList(str1.split(""));
//		System.out.println(list);
//		System.out.println(list.stream().filter(i->i.equalsIgnoreCase(str2)).count());
		answer += list.stream().filter(i->i.equalsIgnoreCase(str2)).count();
		return answer;
	}

}//end class
