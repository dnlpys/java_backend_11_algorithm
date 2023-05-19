package test05.reversestring2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "a#b!GE*T@S";

		System.out.println(solution(str));
	}// end main

	private static String solution(String str) {
		String answer = "";

		// a#b!GE*T@S
		char[] cs = str.toCharArray();
		int left = 0;
		int right = str.length() - 1;

//		System.out.println(Character.isAlphabetic('a'));
//		System.out.println(Character.isAlphabetic('!'));
		//알파벳이면 스왑,알파벳이 아니면 left++, right--
		while (left < right) {
			
			if(!Character.isAlphabetic(cs[left])) {
				left++;
			}else if(!Character.isAlphabetic(cs[right])) {
				right--;
			}else {
				// 알고리즘에 자주쓰이는 함수패턴 : swap 자리바꾸기
				char temp = cs[left]; // '' = g
				cs[left] = cs[right];// g <= d
				cs[right] = temp; // d <= g

				left++;// 0->1
				right--;// 3->2
			}
		}
		answer = String.valueOf(cs);
		return answer;
	}
}// end class
