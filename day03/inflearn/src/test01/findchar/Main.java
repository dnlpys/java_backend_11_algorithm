package test01.findchar;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();//입력된 라인한줄 문자열
		String str2 = s.nextLine();//입력된 라인한줄 문자열
//		String str1 = "Computercooler";
//		String str2 = "c";
		
		System.out.println(solution(str1,str2));
		
		
	}//end main

	private static String solution(String str1,String str2) {
		String answer = "";
		int count = 0;
		for (int i = 0; i < str1.length(); i++) {
//			System.out.println(str1.toLowerCase().charAt(i)==str2.charAt(0));
			if(str1.toLowerCase().charAt(i)==str2.charAt(0)) {
				count++;
			}
		}
		answer += count;
		return answer;
	}

}//end class
