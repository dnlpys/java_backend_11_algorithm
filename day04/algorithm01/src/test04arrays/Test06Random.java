package test04arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Test06Random {

	public static void main(String[] args) {
		
		
		//랜덤한 정수 3개를 배열에 할당하세요
		List<Integer> list = new ArrayList<Integer>();
		
		Random r = new Random();
//		System.out.println(r.nextInt());
		for (int i = 0; i < 3; i++) {
			list.add(r.nextInt());
		}
		System.out.println(list);
		
		List<Integer> list2 = new Random().ints(3).boxed().collect(Collectors.toList());
		System.out.println(list2);
		
		List<Double> list3 = new Random().doubles(3).boxed().collect(Collectors.toList());
		System.out.println(list3);
		
		
	}// end main

}
