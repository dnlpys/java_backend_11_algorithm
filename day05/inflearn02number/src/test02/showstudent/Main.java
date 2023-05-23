package test02.showstudent;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 8;
//		String str = s.nextLine();
		String str = "130 135 148 140 145 150 150 153 ";
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < len ; i++) {
//			sb.append("130 135 148 140 145 150 150 153 ");
////			str += "130 135 148 140 145 150 150 153 ";
//		}
//		str = sb.toString();
		System.out.println(solution(str));
		
		
	}//end main

	private static String solution(String str) {
		String answer = "";
		//문자열 >> 문자열배열 >> 정수배열
		String[] arr = str.split(" ");
		int[] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		//첫학생은 무조건 보임 : 카운팅
		String temp = "";
		temp += nums[0];
		
		//i+1까지 비교해야되므로 끝에서 두번째까지만 반복
		for (int i = 0; i < nums.length-1; i++) {
//			System.out.println(nums[i]);
			//뒷학생이 앞학생보다 크다면 카운팅
			if(nums[i] < nums[i+1]) {
				//카운팅 증가
				temp += " "+nums[i+1];
			}
			//뒷사람이 작거나 같은 학생은 큰키로 바꿔치기
			if(nums[i] >= nums[i+1]) {
				nums[i+1] = nums[i];
			}
		}
		answer += temp.split(" ").length;
		return answer;
	}

}//end class
