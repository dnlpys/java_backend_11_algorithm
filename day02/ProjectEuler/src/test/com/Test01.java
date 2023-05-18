package test.com;

import java.util.stream.IntStream;

public class Test01 {

	/*
	 * 10보다 작은 자연수 중에서 3 또는 5의 배수는 3, 5, 6, 9 이고,
	 * 
	 * 이것을 모두 더하면 23입니다.
	 * 
	 * 1000보다 작은 자연수 중에서 3 또는 5의 배수를 모두 더하면 얼마일까요?
	 * 
	 */

	public static void main(String[] args) {
		
		// 자연수 : 1부터 시작하여 1씩증가하는 수를 말한다.
//		int answer = 0;
//		for (int i = 1; i < 1000; i++) {
//			if(i%3==0 || i%5==0) {
//				answer += i;
//			}
//		}
//		System.out.println(answer);
		
		int answer = IntStream.range(1, 1000).filter(i->i%3==0 || i%5==0).sum();
		System.out.println(answer);
		
		
	}//end main

}//end class
