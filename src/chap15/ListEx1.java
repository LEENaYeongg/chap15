package chap15;

import java.util.ArrayList;
import java.util.List;

/*List ����
 * List �������̽� : Collection �������̽��� ���� �������̽�
 * 				 ��ü���� ������ �� ������ ����.
 * 				 ÷�� ����� ������.
 * ����Ŭ���� : ArrayList, Vector, LinkedList ���� �ִ�.
 * */
public class ListEx1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(); //==> thread �� ���ؼ� unsafe
//		List<Integer> list = new Vector<Integer>(); ==> thread �� ���ؼ� safe
//		List<Integer> list = new LinkedList<Integer>();
		list.add(1);list.add(2);list.add(5);
		list.add(4);list.add(3);list.add(0);
		list.add(0);
		System.out.println(list);
		for(int i =0;i<list.size();i++) {
			System.out.println(i+":"+list.get(i));
		}
		// jdk8.0 ���Ŀ� ���� �ڷ����� ��� <> ǥ�÷� ����
		List<Integer> list2 = new ArrayList<>(list.subList(1,4));
		System.out.println(list2);
		for(Integer i : list) { //������ for �������� ����ϱ�
			System.out.println(i);
		}
	}

}
