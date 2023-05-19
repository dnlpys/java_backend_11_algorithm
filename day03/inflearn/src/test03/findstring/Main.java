package test03.findstring;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "it is time to study";
		System.out.println(solution(str));
	}//end main

	private static String solution(String str) {
		String answer = "";
		
		int temp = 0;
		//1.배열로 만들고 반복문 구현
		for (String x : str.split(" ")) {
			//2.아이템x의 길이가 임시저장된 문자열의 길이보다 크면 if
			if(x.length() > temp) {
				temp = x.length(); // 큰문자열의 길이 임시저장
				answer = x;// 답변에 단어 할당.
			}
		}
		
		
		return answer;
	}
}//end class
