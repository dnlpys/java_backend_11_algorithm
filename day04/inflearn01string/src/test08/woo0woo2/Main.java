package test08.woo0woo2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "found7, time: study; Yduts; emit, 7Dnuof";

		System.out.println(solution(str));// YES or NO
	}// end main

	private static String solution(String str) {
		String answer = "NO";

		// 알바펫을 제외하고 제거 하려면
		
		//1. 알파벳검증
		//	Character.isAlphabetic(0)
		// str.matches[^a-zA-Z]
		System.out.println(str);
		
		str = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(str);
		
		
		//2. 바꿔라 : str.replace(), str,replaceAll()

		// 3.주어진 문자열이 대소분자 구분없이 뒤집은 문자열과 같다면 : YES
		if (str.equalsIgnoreCase(new StringBuffer(str).reverse().toString())) {
			answer = "YES";
		}

		return answer;
	}
}// end class
