package test06.removestring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "ksekkset";

		System.out.println(solution(str));//kset
	}// end main

	private static String solution(String str) {
		String answer = "";

		//1.반복문으로 문자열을 반복
		for (int i = 0; i < str.length(); i++) {
			//2.문자의 위치가 인덱스의 위치와 다르면 중복된것
			System.out.println(str.indexOf(str.charAt(i)) +","+i);
			if(str.indexOf(str.charAt(i)) == i) {
				answer += str.charAt(i);
			}
		}
		
		return answer;
	}
}// end class
