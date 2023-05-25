package test01.recursive;

import java.util.Scanner;

public class Main2 {
	/*
	 * 입력
	 * 3
	 * 
	 * 출력
	 * 1 2 3
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//3
		
		solution(n);
	}

	private static void solution(int n) {
		if(n==0) return;
//		System.out.print(n);//push 3 2 1
		solution(n-1);//3-1,2-1,1-1
		System.out.print(n+" "); //pop 1 2 3
		
	}
}
