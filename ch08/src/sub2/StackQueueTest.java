package sub2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
 * 날짜 : 2024/07/17
 * 이름 : 최영진
 * 내용 : 스택, 큐 실습하기
 * 
 */
public class StackQueueTest {

		public static void main(String[] args) {
			//스택
			Stack<Integer> stack = new Stack<>();
		
			//후입선출
			stack.push(1);
			stack.push(2);
			stack.push(3);
			stack.push(4);
			stack.push(5);
			stack.push(6);
			
			while(!stack.empty()){
			System.out.print(stack.pop() + ",");
			}
			Queue<Integer> queue = new LinkedList<>();
			
			//선입선출
			queue.offer(6);
			queue.offer(5);
			queue.offer(4);
			queue.offer(3);
			queue.offer(2);
			queue.offer(1);
			while(!queue.isEmpty()) {
				System.out.print(queue.poll()+",");
			}
		
		
		
		
		}
}
