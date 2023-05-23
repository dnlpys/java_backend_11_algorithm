package test09.maxsum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 5;
//		String str = s.nextLine();
		String[] strs = new String[len];
		strs[0] = "10 13 10 12 15";
		strs[1] = "12 39 30 23 11";
		strs[2] = "11 25 50 53 15";
		strs[3] = "19 27 29 37 27";
		strs[4] = "19 13 30 13 19";
		System.out.println(solution(strs));
	}//end main

	private static String solution(String[] strs) {
		String answer = "";

		//1.각행+각열+좌대각+우대각 개수만큼의 합계배열
		int[] sums = new int[strs.length*2+2];
//		System.out.println(sums.length);
		
		//2.문자배열 >> 2차원 정수배열 변환
		int[][] ss = new int[strs.length][];
		
		for (int i = 0; i < strs.length; i++) {
			String[] arr = strs[i].split(" ");
			int[] score = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
			ss[i] = score;
		}
		
		for (int[] is : ss) {
			System.out.println(Arrays.toString(is));
		}
		
		//3.반복문 각줄의 합계를 합계배열에 할당
		//3-1.행열 반복문  10개 결과
		for (int x = 0; x < ss.length; x++) {
			//행합
			sums[x] = Arrays.stream(ss[x]).sum();
			
			int[] cols = new int[ss.length];
			for (int i = 0; i < ss[x].length; i++) {
				System.out.print(ss[i][x] + " ");
				cols[i] = ss[i][x];
			}
			System.out.println();
			sums[x+ss.length] = Arrays.stream(cols).sum();
		}
		
		//3-2.우대각 반복문 1개 결과
		int[] cross1 = new int[ss.length];
		for (int i = 0; i < cross1.length; i++) {
			cross1[i] = ss[i][i];
		}
		sums[sums.length-2] = Arrays.stream(cross1).sum();
		
		//3-3.좌대각 반복문 2개 결과
		int[] cross2 = new int[ss.length];
		for (int i = 0; i < cross2.length; i++) {
			cross2[i] = ss[i][cross2.length-1-i];
		}
		sums[sums.length-1] = Arrays.stream(cross2).sum();
		
		
		System.out.println(Arrays.toString(sums));
		
		//4.합계배열에서 max값을 출력
		answer += Arrays.stream(sums).max().getAsInt();
		return answer;
	}

}//end class
