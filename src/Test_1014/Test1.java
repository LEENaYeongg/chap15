package Test_1014;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 1. ȭ�鿡�� �������� �ڿ����� �Է¹޾� �̵� �� Ȧ�� �� �ڿ������� ��� ��� ������ ���ϰ�, 
		Ȧ���� �ִ밪�� �ּҰ��� ã�� ���α׷��� �ۼ��ϱ�(Ȧ�� ��θ� �̷���� List ��ü�� �����Ͽ� ����ϱ�)

7���� �ڿ��� : 12 77 38 41 53 92 85 �� ���
77 41 53 85 �� Ȧ�� �̹Ƿ�
77+41+53+85 = �� 
Ȧ ���� �ִ밪 : 85
Ȧ ���� �ּҰ� : 41
�Էµ� Ȧ�� : [77,41,53,85]

 * */
public class Test1 {
	public static void main(String[] args) {
		System.out.println("�������� �ڿ����� �Է��ϼ���(����:999)");
		Scanner scan = new Scanner(System.in);
		double sum = 0;
		List<Integer> list = new ArrayList<Integer>();
		while (true) {
			int num = scan.nextInt();
			if (num == 999)
				break;
			if(num%2 == 1) {
			list.add(num);
			sum += num;
			}
		}
		System.out.println("�� =" + sum);
		Collections.sort(list);
		System.out.println("�Էµ������� �ִ� : " +list.get(list.size()-1));//�ִ�
		System.out.println("�Էµ������� �ּڰ� : " + list.get(0)); //�ּڰ�
		System.out.println("�Էµ� Ȧ��: " + list);
	}
}
