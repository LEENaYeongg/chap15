package chap15;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/* 1. ���ѹα�=����, ĳ����=��Ÿ��, ����=������ HashMap�� �����ϰ�,
 * 	    ȭ�鿡�� �����̸��� �Է¹޾� �ش� ������ ������ ����ϴ� ���α׷� �����ϱ�
 * 		���� ��ϵ� ���� �ƴ� ��� ��ϵ� ���� �ƴմϴ�. �޽��� ����ϱ�.
 * 2. ���� ���ڰ� �ԷµǸ�, ���� ��ϵ� ���� =���� ���� ����ϰ� ���α׷� �����ϱ�
 * 3. ��ϵ� ���� �ƴ� ��� �Էµ� ������ ������ �Է¹޾� Map �� ����ϱ�.
 * */
public class Exam4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// String cname = scan.nextLine();
		String[] nation = { "���ѹα�", "ĳ����", "����" };
		String[] capital = { "����", "��Ÿ��", "����" };
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < nation.length; i++) {
			map.put(nation[i], capital[i]);
		}
		while (true) {
			System.out.println("���� �Է��ϼ���(����:����)");
			String nation1 = scan.next();
			if (nation1.equals("����"))
				break;
			if (map.get(nation1) == null)
				System.out.println("��ϵȳ��� �ƴմϴ�");
			else
				System.out.println(nation1 + "�� ������" + map.get(nation1) + "�Դϴ�");

		}
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println(map);
		Set<Map.Entry<String, String>> entry = map.entrySet();
		for (Map.Entry<String, String> m : entry) {
			System.out.println(m);
			System.out.println(m.getKey() + "=" + m.getValue());
		}
		System.out.println();

	}

}