package test.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test4 {

	/*
	 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를
	 * 
	 * 대칭수(palindrome)라고 부릅니다.
	 * 
	 * 두 자리 수를 곱해 만들 수 있는 대칭수 중 가장 큰 수는 9009 (= 91 × 99) 입니다.
	 * 
	 * 세 자리 수를 곱해 만들 수 있는 가장 큰 대칭수는 얼마입니까?
	 * 
	 */

	public static void main(String[] args) {

		// 1.대칭수 검증
//		int su = 9009;
//		su = 8888;
//		su = 1221;
//		su = 122221;
//		su = 989989;
//		su = 999999;
// 		시머트리(Symmetry)좌우대칭을 의미.
		long startTime = System.currentTimeMillis();
		int positionCount = 10;
		positionCount = 1000;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int x = positionCount; x < positionCount *10 ; x++) {
			for (int i = positionCount; i < positionCount * 10; i++) {
				if(isSymmetry(x*i)) {
					System.out.println(x+"*"+i+"="+x*i);
					list.add(x*i);
				}
			}//end for
		}//end for
		System.out.println(Collections.max(list));
		System.out.println("time:"+(System.currentTimeMillis()-startTime));
	}// end main
	private static boolean isSymmetry(int su) {// 대칭수 검증메소드 정의
		
		String strSu = String.valueOf(su);
		//9009 : 90 09 >> 90
		String leftStr = strSu.substring(0,strSu.length()/2);
		String rightStr = strSu.substring(strSu.length()/2);
		String reverseRightStr = new StringBuffer(rightStr).reverse().toString();
//		System.out.println(leftStr +" "+ reverseRightStr);
		
		return leftStr.equals(reverseRightStr);//90 90 : true
	}

}// end class
