package test08.rank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 5;
//		String str = s.nextLine();
		String str = "87 89 92 100 76";//4 3 2 1 5
//		String str = "87 89 92 100 100";//5 4 3 1 1
		System.out.println(solution(len,str));
	}//end main

	private static String solution(int len,String str) {
		String answer = "";

		System.out.println(str);
		
		//1.문자열배열 스플릿
		String[] arr = str.split(" ");
		
		//2.정수배열변환
		int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		System.out.println(Arrays.toString(score));
		
		//3.등수배열(0등은 없으니 1등으로 모두채우기)
		int[] rank = new int[len];//0,0,0,...
		Arrays.fill(rank, 1);
		System.out.println(Arrays.toString(rank));
		
		//4.반복문 순위결정(동점시 동일등수적용)
		for (int x = 0; x < score.length; x++) {
			//rank[x] = 1;//(0등은 없으니 1등으로 모두채우기)
			
			for (int i = 0; i < score.length; i++) {
				//x점수와 i점수들을 비교
				if(score[x] <  score[i]) {
					rank[x]++;
				}
			}
		}
		
		//5.출력
		System.out.println(Arrays.toString(rank));
		
		answer = String.join(" ", 
				Arrays.stream(rank).mapToObj(String::valueOf).toArray(String[]::new));
		return answer;
	}

}//end class
