package test05collection;

import java.util.Stack;

public class TestStack {

	public static void main(String[] args) {
		
		//stack : LIFO 자료구조
		
		
		//알고리즘 탐색 : 
		//깊이 우선 탐색 : DFS(Depth First Search)- Stack
		//너비 우선 탐색 : BFS(Breadth First Search)- Queue
		
		Stack<Integer> st = new Stack<Integer>();
		st.push(100);
		st.push(200);
		st.push(300);
		st.add(400);
		System.out.println(st);
		System.out.println(st.get(0));
		System.out.println(st.get(1));
		System.out.println(st.get(2));
		System.out.println(st.get(3));
		st.set(0, 500);
		System.out.println(st);
		
		System.out.println(st.pop());

		st.remove(1);
		System.out.println(st);
		

		//가장 마지막 아이템이 뭐니?
		System.out.println(st.get(st.size()-1));
		System.out.println(st.peek());//현재 가장 마지막객체의 정보
		
		System.out.println(st.contains(500));
		System.out.println(st.contains(300));
		
	
		
		
	}//end main

}//end class
