package chap15;

import java.util.List;
import java.util.Vector;

/* Vector ���� : Collection �����ӿ�ũ ���� Ŭ����
 * 				List �������̽��� ���� Ŭ����
 * 				���� ���� �޼���� List�� ������ �޼��尡 �Բ� ���� */
public class ListEx2 {
	public static void main(String[] args) {
		Vector<Double> list = new Vector<>(); 
		//double �� ���� ���� ==> Collection �� �⺻�ڷ������� ���� �� ����.
//		List<Double> list = new Vector<>();
		list.add(0.3); //0.3�� �⺻�ڷ��������� �� �� �ִ� ���� : �ڵ�����ȯ(Boxing) 
		//Boxing : �⺻�ڷ��� ��ü�� double�� �ٲ�°�.
		list.add(Math.PI);
		list.addElement(5.0); // Vector�� ���� �޼���. add() ���� ��� // addElement�� list�� ����� �ƴϴ�. //int���� �ȵǼ� 5�� ����
		for (Double d : list) {
			System.out.println(d);
		}
		double num = 5.0;
		//list ��ü���� num ��ü�� ��ġ ����
		int index = list.indexOf(num);
		//contains : list�� ���ο� num ��ü ����? (true/false)
		if (index < 0)
			System.out.println(num + "�� list�� �����ϴ�.");
		else
			System.out.println(num + "�� ��ġ: " + index);

		num = 0.3;
		System.out.println(list.indexOf(num));
		if (list.contains(num)) {
			list.removeElement(num);
			System.out.println(num + "������");
		}
		list.remove(5.0);
		System.out.println(list);
		System.out.println(list.get(0)+","+list.size()); //÷�ڴ� �׻� ���������� �Դٰ�����. ������
	}
}
