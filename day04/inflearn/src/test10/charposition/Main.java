package test10.charposition;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
//		String str = "teachermode e";
		String[] strs = str.split(" ");
		System.out.println(solution(strs[0],strs[1].charAt(0)));//1 0 1 2 1 0 1 2 2 1 0
	}// end main

	private static String solution(String str, char c) {
		String answer = "";
//		System.out.println(str);
//		System.out.println(c);
//		System.out.println("======");
		//t e a c h e r m o d e
		//1 0 1 2 1 0 1 2 2 1 0
		char[] cs = str.toCharArray();
		
		ArrayList<String> arr = new ArrayList<String>();
		
		//1.순서대로 반복하면서 얼만큼 떨어졌는지 ?
		int count = 0;
		for (int i = 0; i < cs.length; i++) {
//			System.out.println(cs[i]);
			if(cs[i] == c) {
				count = 0;
				arr.add(String.valueOf(count));
			}else {
				count++;
				arr.add(String.valueOf(count));
			}
		}
//		System.out.println(arr);
//		System.out.println(String.join(" ", arr));
		
		
		//2.반대로 돌리면서 얼만큼 떨어졌는지?
		//3.짧게 떨어진 수로 바꾸면 끝~
		count = 0;
		for (int i = cs.length-1; i >= 0 ; i--) {
//			System.out.println(cs[i]);
			if(cs[i] == c) {
				count = 0;
			}else {
				count++;
				arr.set(i,
						String.valueOf(
								Math.min(
										Integer.parseInt(
												arr.get(i)), 
										count)));
			}
		}
//		System.out.println(arr);
//		System.out.println(String.join(" ", arr));
		
		answer = String.join(" ", arr);
		
		//최소 : Math.min()
		//출력 : String.join(" ",arr);//1 0 1 2 1 0 1 2 2 1 0
		return answer;
	}
}// end class
