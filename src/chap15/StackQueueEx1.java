package chap15;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/* Stack : LIFO (Last in First Out)
 * 		Stack Ŭ���� : Vector Ŭ������ ���� Ŭ����. List ��ü��.
 * 		push(Object o) : ��ü�� stack�� �߰�
 * 		Object pop() : stack�� ��ü�� ������ ����.
 * 		Object peek() : stack�� ��ü�� ��ȸ�Ͽ� ����(��������). 
 * Queue : FIFO (First in First out)
 * 		Queue �������̽� : LinkedList ���� Ŭ������.
 * 		Offer(Object o) : ��ü�� queue�� �߰�
 * 		Object poll() : queue�� ��ü�� ����. ����
 * 		Object peek() : queue�� ��ü�� ��ȸ�Ͽ� ����
 * 
 * */
public class StackQueueEx1 {
	public static void main(String[] args) {
	String[] cars = {"�ҳ�Ÿ", "�׷���", "SM5", "K9"};
	Stack<String> stack = new Stack<>();
	for(String s :cars) stack.push(s);
	System.out.println("���ÿ� ����� ��ü�� ����:" +stack.size());
	System.out.println(stack.peek());
	System.out.println("���ÿ� ����� ��ü�� ����:" +stack.size());
	System.out.println(stack.pop());
	System.out.println("���ÿ� ����� ��ü�� ����:" +stack.size());
	System.out.println(stack.pop());
	System.out.println("���ÿ� ����� ��ü�� ����:" +stack.size());
	Queue<String> queue = new LinkedList<>();
	for(String s : cars) queue.offer(s);
	System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
	System.out.println(stack.peek());
	System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
	System.out.println(queue.poll());
	System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
	System.out.println(queue.poll());
	System.out.println("ť�� ����� ��ü�� ����:" + queue.size());
	}

}
