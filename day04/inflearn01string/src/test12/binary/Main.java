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
		
		String temp = "";
		//반복문1 - 암호 나누기 len
		//반복문2 - len*7 7씩증가
		for (int i = 0; i < len*7; i+=7) {
//			System.out.println(i);
			
			//일곱자리씩 획득
			temp = str.substring(i, i+7);
//			System.out.println(temp);
			
			//암호를 잘라서 #=1,*=0 바꿔치기
			temp = temp.replace("#", "1").replace("*", "0");
			System.out.println(temp);
			
			//정수로바꿔서 
			int su = Integer.parseInt(temp,2);//2진수 문자열을 10진수로 파싱
			System.out.println(su+":"+(char)su);
			
			//문자형들 결합
			answer += (char)su;
		}
		return answer;
	}
}// end class
