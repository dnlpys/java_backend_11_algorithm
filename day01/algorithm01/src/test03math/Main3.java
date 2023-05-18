package test03math;

import java.util.Scanner;

public class Main3 {

	/*
	 * 입력받은(주어진) 정수의 15제곱을 한후 결과를 각각의 수의 합을 계산해서
	 *  출력하는 프로그램을 작성하세요
	 * 2**15 = 32768 : 3+2+7+6+8 = 26
	 * 입력 예시 :
	 * 
	 * 2
	 * 
	 * 15
	 * 
	 * 출력 예시 :
	 * 
	 * 26
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int su1 = s.nextInt();//입력된 라인한줄 문자열
//		int su2 = s.nextInt();//입력된 라인한줄 문자열
		int su1 = 2;
		int su2 = 15;
		
		System.out.println(solution(su1,su2));
		
		
	}//end main

	private static String solution(int su1,int su2) {
		String answer = "";
		int p = (int)Math.pow(su1, su2);
		
		char[] cs = String.valueOf(p).toCharArray();
		int sum = 0;
		for (int i = 0; i < cs.length; i++) {
//			System.out.print(cs[i]);
			sum += Integer.parseInt(String.valueOf(cs[i]));
		}
//		System.out.println();
		answer = String.valueOf(sum);
//		answer = Integer.toString(sum);//26
//		answer = Integer.toString(sum,2);//11010 16+8+2
//		answer = Integer.toString(sum,8);//32  3*8+2
//		answer = Integer.toString(sum,16);//1a  16*1 + a=10 
		
		return answer;
	}

}//end class
