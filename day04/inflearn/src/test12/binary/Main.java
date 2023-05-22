package test12.binary;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String len = s.nextLine();
//		String str = s.nextLine();
		String len = "4";
		String str = "#****###**#####**#####**##**";
		System.out.println(solution(Integer.parseInt(len), str));//COOL
	}// end main

	private static String solution(int len,String str) {
		String answer = "";
		System.out.println(len);
		System.out.println(str);
		
		//반복문1 - 암호 나누기 len
		//반복문2 - len*7 7씩증가
		
		//암호를 잘라서 #=1,*=0 바꿔치기
		
		//정수로바꿔서 
		
		//문자형들 결합
				
		return answer;
	}
}// end class
