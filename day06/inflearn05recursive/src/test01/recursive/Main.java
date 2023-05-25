package test01.recursive;

public class Main {

	public static void main(String[] args) {
		// 재귀함수 기본원리...
		recursiveTest(1);
	}

	private static void recursiveTest(int count) {
		System.out.println("count:"+count);
		
		count++;
//		if(count>5)return;
		if(count <= 5) {
			recursiveTest(count);
		}
		return;
	}

}
