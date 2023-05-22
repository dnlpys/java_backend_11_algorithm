package test11.strcount;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "KKHSSSSSSSE";
		System.out.println(solution(str));//K2H7E
	}// end main

	private static String solution(String str) {
		String answer = "";
		System.out.println(str);
		
//		주의(맨끝은 +1하면 에러)
		str += " ";//문자하나를 늘려주고 반복문에서는 -1
		
		//str.charAt(i)
		//str.toCharArray()
		//for
		int count = 1;//첫문자카운트는 무조건 1개
		for (int i = 0; i < str.length()-1; i++) {
//			System.out.println(str.charAt(i));
			if(str.charAt(i) == str.charAt(i+1)) {
				count++; // 연속된문자 일때 증가
			}else {
				answer += str.charAt(i);
				if(count >= 2) answer += count;
				count = 1;
			}
		}
		
//		//[0] == [0 + 1] count++     : 주의(맨끝은 +1하면 에러)
		//else count=1
		//count>=2 : print대상 즉 1일때는 1일라고 출력한하겠다
		
		return answer;
	}
}// end class
