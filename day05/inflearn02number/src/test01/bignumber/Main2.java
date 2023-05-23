package test01.bignumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 6;
//		String str = s.nextLine();
		String str = "7 3 9 5 6 12";
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		//문자열 >> 문자열배열 >> 정수배열
		String[] arr = str.split(" ");
		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
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
