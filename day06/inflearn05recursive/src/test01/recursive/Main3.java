package test01.recursive;

import java.util.Scanner;

public class Main3 {
	/*
	 * 입력
	 * 11
	 * 
	 * 출력
	 * 1011
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//11
		
		solution(n);
	}

	private static void solution(int n) {
		if(n==0) return;
//		System.out.print(n+" ");//push 11 5 2 1 
		solution(n/2);//
		System.out.print(n%2); //pop 1 0 1 1 : 11
		
	}
}
