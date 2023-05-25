package test01.recursive;

import java.util.Scanner;

public class Main4 {
	/*
	 * 입력
	 * 5
	 * 
	 * 출력
	 * 120
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//5
		
		System.out.println(solution(n));//120
	}

	private static int solution(int n) {
		System.out.print(n+" ");//push 5 4 3 2 1 
		if(n==1) return 1;
		
		return solution(n-1)*n;//pop 1*2*3*4*5
	}
}
