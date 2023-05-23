package test07.score;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 10;
//		String str = s.nextLine();
		String str = "1 0 1 1 1 0 0 1 1 0";
		System.out.println(solution(len,str));//10
	}//end main

	private static String solution(int len,String str) {
		String answer = "";

		System.out.println(str);
		//1. 공백제거
		
		//2.str.charAt(0) 활용 >> 반복문 >> count++
		
		//3.total score 계산
		
		answer += 10;
		return answer;
	}

}//end class
