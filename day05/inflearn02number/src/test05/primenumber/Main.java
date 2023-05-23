package test05.primenumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = s.nextInt();
		int len = 20;
		System.out.println(solution(len));//8
	}//end main

	private static String solution(int len) {
		String answer = "";
		//1 2 3 5 7 11 13...
		//1.소수냐 아니냐를 검증할 배열 : Boolean배열
		//0 1 2 3 4 5 6 7...
		ArrayList<Boolean> prime = new ArrayList<Boolean>();
		prime.add(false);//0
		prime.add(false);//1
		for (int i = 2; i <= len; i++) {
			prime.add(true);
		}
		System.out.println(prime);
		//2. 2중 반복문을 이용 : 소수면 true,소수가 아니면false
		for (int x = 2; x*x <= len; x++) {
			System.out.println("====="+x+"=====");
			if(prime.get(x)) {
				for (int i = x*x; i <= len; i+=x) {
					System.out.println(i);
					prime.set(i, false);//배수들 포지션 false
				}
			}
		}
		
		System.out.println(prime);
		
		//3.true개수만 카운트 하면 끝
		System.out.println("==========");
		int count = 0;
		for (int i = 0; i < prime.size(); i++) {
			if(prime.get(i)) {
				count++;
			}
		}
		answer += count;
		return answer;
	}

}//end class
