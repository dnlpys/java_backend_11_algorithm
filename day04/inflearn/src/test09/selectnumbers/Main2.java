package test09.selectnumbers;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "g0en2T0s8eSoft";

		System.out.println(solution(str));//208
	}// end main

	private static int solution(String str) {
		String answer = "";
		
		//숫자들만 뽑아라 == 숫자가아닌것들은 제거해라
		//[0-9]
		
		System.out.println(str);
//		Character.isDigit(0) 숫자검증
		
		for (char x : str.toCharArray()) {
			if(Character.isDigit(x)) {
				System.out.println(x);
				answer += x;
			}
		}
		
		return Integer.parseInt(answer);
	}
}// end class
