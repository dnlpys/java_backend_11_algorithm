package test06.removestring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		String str = s.nextLine();
		String str = "ksekkset";

		System.out.println(solution(str));//kset
	}// end main

	private static String solution(String str) {
		String answer = "";

		//스트림으로 해보세요
		//스트림에 오라클 중복배제와 같은 함수가 있다.
		List<String> list = new ArrayList<String>(Arrays.asList(str.split("")));
		
		answer = list.stream().distinct().reduce("", String::concat);
		
		return answer;
	}
}// end class
