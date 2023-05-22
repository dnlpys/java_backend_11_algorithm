package test04.reversestring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

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
			list.add(new StringBuffer(x).reverse().toString());
		}
		
		return list;
	}
}//end class
