package test04.reversestring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int len = Integer.parseInt(s.nextLine());
		int len = 3;
		String[] arr = new String[] {"good","Time","Big"};
//		String[] arr = new String[len];
//		for (int i = 0; i < len; i++) {
//			String str = s.nextLine();//good,Time,Big
//			arr[i] = str;
//		}
		
		List<String> list = solution(arr);
		for (String x : list) {
			System.out.println(x);
		}
	}//end main

	private static List<String> solution(String[] arr) {
		List<String> list = new ArrayList<String>();
		
		for (String x : arr) {
			//good
			char[] cs = x.toCharArray();
			int left = 0;
			int right = x.length()-1;
			
			while(left<right) {
				//알고리즘에 자주쓰이는 함수패턴 : swap 자리바꾸기
				char temp = cs[left]; //'' = g
				cs[left] = cs[right];// g <= d
				cs[right] = temp; // d <= g
				
				
				left++;//0->1
				right--;//3->2
			}
			
			list.add(String.valueOf(cs));
		}
		
		return list;
	}
}//end class
