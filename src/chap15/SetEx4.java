package chap15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* ����ڰ� ������ Ŭ������ ��ü�� TreeSet�� �����ϱ�
 * ���İ��� �������̽�
 * 1. Comparable<T> �������̽�
 * 		int CompareTo(T) : ��ü�� �⺻ ���Ĺ�� ����.
 * 2. Comparator<T> �������̤�
 * 		int compare(T,T) : ���� ����� ���Ĺ�� ������ �� �ִ� ���.
 *  */

/*ClassCastException : ����*/
class PhoneNo implements Comparable<PhoneNo> {
	String name;
	int number;

	public PhoneNo(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String toString() {
		return name + ":" + number;
	}

	@Override
	public int compareTo(PhoneNo o) {
		return name.compareTo(o.name); // �̰��� ����� ����� ���� ���̴�, �ڸ� ���� ������.
	}
}

public class SetEx4 {
	public static void main(String[] args) {
		List<PhoneNo> list = new ArrayList<>();
		list.add(new PhoneNo("ȫ�浿", 0101234));
		list.add(new PhoneNo("���", 022345));
		list.add(new PhoneNo("�̸���", 7890));

		System.out.println("�̸� ������ �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set = new TreeSet<>(list);
		System.out.println(set);
		System.out.println("�̸� �������� �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set2 = new TreeSet<>(Comparator.reverseOrder());
		set2.addAll(list);
		System.out.println(set2);
		
		System.out.println("��ȭ��ȣ ������ �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set3 = new TreeSet<>(new Comparator<PhoneNo>() {

			@Override //��ȭ��ȣ ������ ������ ��
			public int compare(PhoneNo p1, PhoneNo p2) {
				return p1.number - p2.number;
			}
		});
		set3.addAll(list); //list ��ü�� set ��ü�� ����
		System.out.println(set3);
		
		System.out.println("��ȭ��ȣ �������� �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set4 = new TreeSet<>(new Comparator<PhoneNo>() {

			@Override 
			public int compare(PhoneNo p1, PhoneNo p2) {
				return p2.number - p1.number; //������ p1�� ��.
			}
		});
		set4.addAll(list); 
		System.out.println(set4);
		
		//���ٹ������ ó��
		System.out.println("��ȭ��ȣ �������� �����Ͽ� ����ϱ�");
		TreeSet<PhoneNo> set5 = new TreeSet<>((p1,p2)->p2.number - p1.number); 
		set5.addAll(list); 
		System.out.println(set5);
	}
}
