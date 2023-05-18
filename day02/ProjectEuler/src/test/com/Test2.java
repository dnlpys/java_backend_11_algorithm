package test.com;

import java.util.stream.IntStream;

public class Test2 {

	/*
	 * 피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 
	 * 
	 * 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
	 * 
	 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ... 4백만 이하의 
	 * 
	 * 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
	 * 
	 */

	public static void main(String[] args) {

		//1=0+1, 2=1+1,3=1+2,5=2+3,,,,
		long a = 0, b = 1, temp = 0;

//		long max = 90;
		long max = 4000000;
		
		long sum = 0;
		
		while(temp < max) {
			temp = a + b;
			a = b;
			b = temp;
//			System.out.println("temp:"+temp);
			
			if(temp < max && temp%2==0) {
				sum += temp;
			}
			
		}//end while
		
		System.out.println(sum);
		
	}// end main

}// end class
