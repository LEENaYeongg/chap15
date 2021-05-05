package chap15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* Stack : LIFO (Last in First Out)
 * 		Stack 클래스 : Vector 클래스의 하위 클래스. List 객체임.
 * 		push(Object o) : 객체를 stack에 추가
 * 		Object pop() : stack의 객체를 꺼내고 리턴.
 * 		Object peek() : stack의 객체를 조회하여 리턴(보여만줌). 
 * Queue : FIFO (First in First out)
 * 		Queue 인터페이스 : LinkedList 구현 클래스임.
 * 		Offer(Object o) : 객체를 queue에 추가
 * 		Object poll() : queue의 객체를 꺼냄. 리턴
 * 		Object peek() : queue의 객체를 조회하여 리턴
 * 
 * */
public class StackQueueEx1 {
	public static void main(String[] args) {
	String[] cars = {"소나타", "그랜저", "SM5", "K9"};
	Stack<String> stack = new Stack<>();
	for(String s :cars) stack.push(s);
	System.out.println("스택에 저장된 객체의 갯수:" +stack.size());
	System.out.println(stack.peek());
	System.out.println("스택에 저장된 객체의 갯수:" +stack.size());
	System.out.println(stack.pop());
	System.out.println("스택에 저장된 객체의 갯수:" +stack.size());
	System.out.println(stack.pop());
	System.out.println("스택에 저장된 객체의 갯수:" +stack.size());
	Queue<String> queue = new LinkedList<>();
	for(String s : cars) queue.offer(s);
	System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
	System.out.println(stack.peek());
	System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
	System.out.println(queue.poll());
	System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
	System.out.println(queue.poll());
	System.out.println("큐에 저장된 객체의 갯수:" + queue.size());
	}

}
