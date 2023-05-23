package test03.giwibawibo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 5;
//		String strA = s.nextLine();
//		String strB = s.nextLine();
		String strA = "2 3 3 1 3";
		String strB = "1 1 2 2 3";
		System.out.println(solution(len,strA,strB));
		
		
	}//end main

	private static String solution(int len,String strA,String strB) {
		String answer = "";
		//문자열 >> 문자열배열 >> 정수배열
		String[] arrA = strA.split(" ");
		String[] arrB = strB.split(" ");
		int[] numsA = Arrays.stream(arrA).mapToInt(Integer::parseInt).toArray();
		int[] numsB = Arrays.stream(arrB).mapToInt(Integer::parseInt).toArray();

		
		for (int i = 0; i < len; i++) {
			//비겼을때
			if(numsA[i]==numsB[i]) {
				answer += "D\n";
			}else if(numsA[i]==1 && numsB[i]==3) { //A승
				answer += "A\n";
			}else if(numsA[i]==2 && numsB[i]==1) {//A승
				answer += "A\n";
			}else if(numsA[i]==3 && numsB[i]==2) {//A승
				answer += "A\n";
			}else {
				answer += "B\n"; //나머지는 B승
			}
		}
		
		return answer;
	}

}//end class
