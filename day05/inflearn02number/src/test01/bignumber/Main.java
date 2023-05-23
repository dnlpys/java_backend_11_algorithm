package test01.bignumber;

import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
//		int len = 6;
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = s.nextInt();
		}
//		nums[0] = 7;
//		nums[1] = 3;
//		nums[2] = 9;
//		nums[3] = 5;
//		nums[4] = 6;
//		nums[5] = 12;
		System.out.println(solution(nums));
		
		
	}//end main

	private static String solution(int[] nums) {
		String answer = "";
		//무조건 첫수는 출력
		answer += nums[0];

		//i+1까지 비교해야되므로 끝에서 두번째까지만 반복
		for (int i = 0; i < nums.length-1; i++) {
//			System.out.println(nums[i]);
			//뒷수가 앞수보다 크다면 큰수를 할당
			if(nums[i] < nums[i+1]) {
				answer += " "+nums[i+1];
				//답변에 추가
			}
			
		}
		
		return answer;
	}

}//end class
