package test01.recursive;

import java.util.Scanner;

public class Main5 {
	/*
	 * 입력
	 * 10
	 * 
	 * 출력
	 * 1 1 2 3 5 8 13 21 34 55
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();//10
//		int n = 10;
		int n = 45;
		for (int i = 1; i <= n; i++) {
			System.out.print(solution(i)+" ");//1 1 2 3 5 8 13 21 34 55
		}
	}

	private static int solution(int i) {
//		System.out.print(i+" ");//push 
		if(i<=1) return i;
		
		return solution(i-2) + solution(i-1);//pop 
	}
}
