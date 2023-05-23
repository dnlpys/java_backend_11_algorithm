package test05.primenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 20;
		System.out.println(solution(len));//8
	}//end main

	private static String solution(int len) {
		String answer = "";
		//1 2 3 5 7 11 13...
		//1.소수냐 아니냐를 검증할 배열 : int[]배열
		//0 1 2 3 4 5 6 7...
		int[] sus = new int[len+1];//index : 0-19,20 [0,0,0...,0]21개
//		for (int x : sus) {
//			System.out.print(x +" ");
//		}
//		System.out.println();
		
		//2. 2중 반복문을 이용 : 소수면 0
		int count = 0;
		for (int x = 2; x <= len; x++) {
			System.out.println("====="+x+"====="+sus[x]);
			if(sus[x]==0) {
				//0== 소수가됨
				count++;
				//배수들은 소수에서 제외
				for (int i = x; i <= len; i+=x) {
					System.out.println(i);
					sus[i] = 1;
				}
			}
		}
//		System.out.println(count);

		answer += count;
		return answer;
	}

}//end class
