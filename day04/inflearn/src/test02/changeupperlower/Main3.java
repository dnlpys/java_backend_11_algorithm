package test02.changeupperlower;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();//입력된 라인한줄 문자열
		String str = "StuDY";
		System.out.println(solution(str));//sTUdy
	}//end main

	private static String solution(String str) {
		String answer = "";
		
//		for (int i = 65; i <= 122; i++) {
//			System.out.println(i+" : "+ (char)i);
//		}
		
		//97~122소문자, 65~90대문자 를 이용해서분기.
		//A + 32 = a,   a -32 = A
		
		//문자열 >> 케릭터배열 : toCharArray()
		
		for (char x : str.toCharArray()) {
			if(x>= 65 && x<=90) {
				answer += (char)(x+32);
			}else {
				answer += (char)(x-32);
			}
		}
		
//		String[] arr = str.split("");
//		for (int i = 0; i < arr.length; i++) {
//			char x = arr[i].charAt(0);
//			if(x>= 65 && x<=90) {
//				answer += (char)(x+32);
//			}else {
//				answer += (char)(x-32);
//			}
//		}
		return answer;
	}
}//end class
