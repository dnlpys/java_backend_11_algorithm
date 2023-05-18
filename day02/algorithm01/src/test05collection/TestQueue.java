package test05collection;

import java.util.LinkedList;
import java.util.Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		//Queue : FIFO 자료구조
		
		//알고리즘 탐색 : 
		//깊이 우선 탐색 : DFS(Depth First Search)- Stack
		//너비 우선 탐색 : BFS(Breadth First Search)- Queue
		
		Queue<Integer> qu = new LinkedList<Integer>();
		qu.offer(100);
		qu.offer(200);
		qu.offer(300);
		qu.add(400);
		qu.add(500);
		qu.add(600);
		qu.add(700);
		
		System.out.println(qu);

		System.out.println(qu.poll());
		System.out.println(qu.poll());
		System.out.println(qu.remove());
		
		System.out.println(qu.remove(500));
		
		System.out.println(qu);
		
		System.out.println(qu.peek());//현재 가장 처음객체의 정보
		
		
		
	}//end main

}//end class
