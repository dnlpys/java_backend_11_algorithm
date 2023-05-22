package test04arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test03StreamOf {

	public static void main(String[] args) {
		
		
		Double[] ds = new Double[] {1.1, 2.2, 3.3 ,2.0, 1.8};
		//각요소의 10배증가값이 20이상인 요소들의 갯수는?
		
		long count = Stream.of(ds).filter(x-> x * 10 >= 20).count();
		System.out.println(count);
		
		List<Double> list = Arrays.stream(ds).filter(x->x*10>=20).collect(Collectors.toList());
		System.out.println(list);
		
		
		
		
	}// end main

}
