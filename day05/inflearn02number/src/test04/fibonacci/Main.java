package test04.fibonacci;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 10;
		System.out.println(solution(len));//1 1 2 3 5 8 13 21 34 55
//		1번째 수를 1로, 2번째 수도 1로 놓고, 
//		3번째 수부터는 바로 앞의 두 수를 더한 수로 
//		정의하는 게 좀더 흔하게 알려져 있는 피보나치 수열이다. 
		
	}//end main

	private static String solution(int len) {
		String answer = "";
		
		//1. 첫번째,두번째를 변할당.
		long a = 1,b = 1;
		
		answer += a + " "+ b +" ";
		
		for (int i = 2; i < len; i++) {
			long temp = a + b;
			a = b;
			b = temp;
//			System.out.println(temp);
			answer += temp + " ";
		}
		
		
		return answer;
	}

}//end class
