package test06.reverseprime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 9;
		//32 55 62 20 250 370 200 30 100
//		String str = s.nextLine();
		String str = "32 55 62 20 250 370 200 30 100";
		System.out.println(solution(len,str));//23 2 73 2 3
	}//end main

	private static String solution(int len,String str) {
		String answer = "";

		System.out.println(str);
		
		//1.스플릿 >> 문자열 배열
		String[] arr = str.split(" ");
		
		//2.문자열배열 >> 반복문 >> 뒤집기 >> 정수로 바꿔서 >> 정수배열에 할당.
		int[] sus = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			sus[i] = Integer.parseInt(new StringBuffer(arr[i]).reverse().toString());
//			System.out.println(sus[i]);
		}
		
		//3.정수배열을 사용하여 소수검증(이중포문)
		for (int x = 0; x < sus.length; x++) {
			System.out.println("=========="+sus[x]);
			
			for (int i = 2; i <= sus[x]; i++) {
				//i가 끝까지 증가하여 sus[x]와 같으면 소수로 인정
				if(sus[x] == i) {
					System.out.println(i);
					answer += i + " ";
				}
				
				//i가 증가하다가 나누어떨어지는 경우는 소수가아니므로 반복문 탈출
				if(sus[x]%i==0) {
					break;
				}
			}
		}
		return answer;
	}

}//end class
