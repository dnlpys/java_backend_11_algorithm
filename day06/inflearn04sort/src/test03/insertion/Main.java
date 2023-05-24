package test03.insertion;

import java.util.Scanner;

public class Main {
	/*
	 * 6
	 * 11 7 5 6 10 9
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		for (int x : solution(n, arr)) {
			System.out.print(x + " ");
		}
	}

	private static int[] solution(int n, int[] arr) {
		// 삽입정렬
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			int j = i - 1;
			while (j >= 0 && tmp < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = tmp;
		}
		return arr;
	}
}
