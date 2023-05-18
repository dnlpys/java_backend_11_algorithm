package test01stringlength;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	/*
	 * 입력받은(주어진) 문자열의 길이를 출력하는 프로그램을 작성하세요
	 * 
	 * 입력 예시 :
	 * 
	 * abcdefg
	 * 
	 * 출력 예시 :
	 * 
	 * 7
	 * 
	 * 
	 */

	public static void main(String[] args) throws IOException {
//		System.out.println("String....");

		//1.Scanner : java.util
		Scanner s = new Scanner(System.in);
//		String str = "abcdefg";
		String str = s.nextLine();//입력된 라인한줄 문자열
//		String s1 = s.next(); //입력된 한단어(스페이스 만나기전)
//		System.out.println(s1);
		int s2 = s.nextInt();
		System.out.println(s2);
//		System.out.println(str);
//		System.out.println(str.length());
		
		System.out.println("====");
		
		//2.BufferedReader : java.io
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str2 = br.readLine();
//		System.out.println(str2);
		
//		int i = br.read();
//		System.out.println(i+","+(char)i);
		
	}//end main

}//end class
