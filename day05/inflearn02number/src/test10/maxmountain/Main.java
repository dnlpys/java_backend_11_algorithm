package test10.maxmountain;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/*
	 * 	 0 0 0 0 0 0 0
		 0 5 3 7 2 3 0
		 0 3 7 1 6 1 0
		 0 7 2 5 3 4 0
		 0 4 3 6 4 1 0
		 0 8 7 3 5 2 0
		 0 0 0 0 0 0 0
	 * */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 5;
//		String str = s.nextLine();
		String[] strs = new String[len];
		strs[0] = "5 3 7 2 3";
		strs[1] = "3 7 1 6 1";
		strs[2] = "7 2 5 3 4";
		strs[3] = "4 3 6 4 1";
		strs[4] = "8 7 3 5 2";
		System.out.println(solution(strs));
	}//end main

	private static String solution(String[] strs) {
		String answer = "";
		
		//1.문자배열 >> 2차원 정수배열 변환 >> 테두리 0으로 채우기.
		int[][] ss = new int[strs.length+2][strs.length+2];
		
		for (int i = 0; i < strs.length; i++) {
			//문자열배열
			strs[i] = "0 "+strs[i]+" 0";
			String[] arr = strs[i].split(" ");
			int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			ss[i+1] = score;
		}
		
		for (int[] is : ss) {
			System.out.println(Arrays.toString(is));
		}
		
		//2. 2차원반복문 : 상하좌우값과 비교해서 검증 후 카운티
		int count = 0;
		for (int x = 1; x < ss.length-1; x++) {
			for (int i = 1; i < ss.length-1; i++) {
				if(ss[x][i] > ss[x-1][i] 
						&& ss[x][i] > ss[x+1][i]
						&& ss[x][i] > ss[x][i-1] 
								&& ss[x][i] > ss[x][i+1]) {
//					System.out.println(ss[x][i]);
					count++;
				}
			}
		}
		
		//3.카운트 리턴
		answer += count;
		return answer;
	}

}//end class
