package test03math;

import java.math.BigInteger;
import java.util.Scanner;

public class Main4 {

	/*
	 * 입력받은(주어진) 정수의 15제곱을 한후 결과를 각각의 수의 합을 계산해서
	 *  출력하는 프로그램을 작성하세요
	 * 2**15 = 32768 : 3+2+7+6+8 = 26
	 * 
	 * 2의 1000제곱일때의 결과는?
	 * 
	 * 입력 예시 :
	 * 
	 * 2
	 * 
	 * 1000
	 * 
	 * 출력 예시 :
	 * 
	 * ???
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int su1 = s.nextInt();//입력된 라인한줄 문자열
//		int su2 = s.nextInt();//입력된 라인한줄 문자열
		int su1 = 2;
		int su2 = 1000;
		
		System.out.println(solution(su1,su2));
		
		
	}//end main

	private static String solution(int su1,int su2) {
		String answer = "";
//		System.out.println(Math.pow(su1, su2));//실수형 8바이트
//		System.out.println((long)Math.pow(su1, su2));//63제곱까지만
		
		//2를 기준으로 했을때 64제곱이상일경우 큰수를 처리하는 타입으로 계산해야한다.
		BigInteger p = new BigInteger(String.valueOf(su1)).pow(su2);
		System.out.println(p);
		
		char[] cs = String.valueOf(p).toCharArray();
		int sum = 0;
		for (int i = 0; i < cs.length; i++) {
//			System.out.print(cs[i]);
			sum += Integer.parseInt(String.valueOf(cs[i]));
		}
//		System.out.println();
		answer = String.valueOf(sum);
		
		return answer;
	}

}//end class
