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
		str = str.replace(" ", "");
		System.out.println(str);
		
		int[] score = new int[len];
		
		//첫문제가 정답일때 1점무조건 획득
		if(str.charAt(0)=='1') score[0] = 1;
		
		//2.str.charAt(0) 활용 >> 반복문 >> count++
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			//연속득점>>가산점
			if(str.charAt(i) == str.charAt(i-1)) {
				count++;
				score[i] = count;
			}else {
				count = 1;
				score[i] = 1;
			}
			if(str.charAt(i)=='0') {
				score[i] = 0;
			}
		}
		for (int x : score) {
			System.out.print(x+" ");
		}
		System.out.println();
		//3.total score 계산
		
		int total = Arrays.stream(score).sum();
		answer += total;
		
		//정수배열에서 평균을 구해라
		System.out.println((double)total/len);
		System.out.println(Arrays.stream(score).average().orElse(0));
		return answer;
	}

}//end class
