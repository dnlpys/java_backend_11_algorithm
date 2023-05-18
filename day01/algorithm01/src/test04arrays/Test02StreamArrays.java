package test04arrays;

import java.util.Arrays;

public class Test02StreamArrays {

	public static void main(String[] args) {
		String str = "11 33 22 44";
		String[] arr = str.split(" ");
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		// 스트림 사용 문자열배열 >> 정수배열
		int[] sus = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
		System.out.println(sus);
		System.out.println(Arrays.toString(sus));

		// 스트림 사용 정수배열 문자열배열
		arr = Arrays.stream(sus).mapToObj(String::valueOf).toArray(String[]::new);
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));

	}// end main

}
